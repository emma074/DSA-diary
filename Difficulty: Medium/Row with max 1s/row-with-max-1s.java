// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int c=-1;
        ArrayList <Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    c++;
                }
            }
                res.add(c);
                c=-1;
        }
        return res.indexOf(Collections.max(res));
    }
}