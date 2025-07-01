class Solution {
    // Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        // code here.
        ArrayList <Integer> res=new ArrayList<>();
        printrange(root,low,high,res);
        return res;
    }
    public static void printrange(Node root,int low,int high,ArrayList<Integer>res){
        if(root==null){
            return;
        }
        if(root.data>=low && root.data<=high){
            printrange(root.left,low,high,res);
            res.add(root.data);
            printrange(root.right,low,high,res);
        }
        else if(root.data<=low){
            printrange(root.right,low,high,res);
        }
        else{
            printrange(root.left,low,high,res);
        }
    }
}