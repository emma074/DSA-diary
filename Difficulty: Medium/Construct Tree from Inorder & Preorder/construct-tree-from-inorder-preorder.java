/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    static int i=0;
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        i=0;
        return build(inorder,preorder,0,inorder.length-1);
        
    }
    public static Node build(int [] in,int [] pre,int start,int end){
        if(start>end){
            return null;
        }
        Node root=new Node(pre[i++]);
        int pos=0;
        for(int j=start;j<=end;j++){
            if(in[j]==root.data){
                pos=j;
                break;
            }
        }
        root.left=build(in,pre,start,pos-1);
        root.right=build(in,pre,pos+1,end);
        return root;
    }
}