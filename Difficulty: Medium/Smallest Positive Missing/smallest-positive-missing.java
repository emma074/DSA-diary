class Solution {
    public int missingNumber(int[] arr) {
        // code here
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=9;i++){
            map.put(i,0);
        }
        for(int n:arr){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
        }
        int missing=0;
        for(int i=1;i<=9;i++){
            if(map.get(i)==0){
                missing=i;
                break;
            }
        }
        return missing;
           
    }
}
