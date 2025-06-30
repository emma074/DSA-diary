class Tree {
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int X) {
        // code here.
        if(root==null){
            return null;
        }
        if(root.data>X){
            root.left=deleteNode(root.left,X);
        }
        else if(root.data<X){
            root.right=deleteNode(root.right,X);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node IS=inorderSuc(root.right);
                root.data=IS.data;
                root.right=deleteNode(root.right,IS.data);
            }
        }
        return root;
    }
    public static Node inorderSuc(Node root){//RST leftmost node
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}