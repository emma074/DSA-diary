class Tree {
    public static float findMedian(Node root) {
        ArrayList <Integer> res=new ArrayList<>();
        // code here.
       inorder(root,res);
        int i=res.size()/2;
        if(res.size()%2==0){
            float mid=(res.get(i-1)+res.get(i))/2.0f;
            return mid;
        }
        else{
            return res.get(i);
        }
    }
    public static void inorder(Node root,ArrayList<Integer> res){
        if(root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.data);
        inorder(root.right,res);
    }
}