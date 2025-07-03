/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    ArrayList<Integer> res=new ArrayList<>();
    public int inorderSuccessor(Node root, Node x) {
        // add code here.
        res=inorder(root);
        for(int i=0;i<res.size()-1;i++){
            if(res.get(i)==x.data){
                return res.get(i+1);
            }
        }
        return -1;
    }
    public ArrayList<Integer> inorder(Node root){
        if(root==null){
            return res;
        }
        inorder(root.left);
        res.add(root.data);
        inorder(root.right);
        return res;
    }
}