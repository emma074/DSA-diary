/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        if(root==null){
            return true;
        }
            int hl=height(root.left);
            int hr=height(root.right);
            if(Math.abs(hl-hr)<=1 && isBalanced(root.left)&&isBalanced(root.right)){
                return true;
            }
        return false;
    }
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int hl=height(root.left)+1;
        int hr=height(root.right)+1;
        return Math.max(hl,hr);
    }
}