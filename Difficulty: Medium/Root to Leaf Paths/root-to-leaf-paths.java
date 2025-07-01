/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<Integer> path=new ArrayList<>();
        ArrayList <ArrayList<Integer>> res=new ArrayList<>();
        rtop(root,path,res);
        return res;
    }
    public static void rtop(Node root,ArrayList<Integer>path,ArrayList<ArrayList<Integer>> res){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&& root.right==null){
            res.add(new ArrayList<>(path));//res must point to next otherwise when removing it it change the first path
        }
        else{
            rtop(root.left,path,res);
            rtop(root.right,path,res);
        }
        path.remove(path.size()-1);
        
    }
}