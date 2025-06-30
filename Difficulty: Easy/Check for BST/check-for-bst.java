class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        return BST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
        // code here.
    boolean BST(Node root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }
        return BST(root.left,min,root.data) && BST(root.right,root.data,max);
    }
}