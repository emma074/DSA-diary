class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
       boolean dp[]=new boolean[sum+1];
       dp[0]=true;
       for(int n:arr){
           for(int j=sum;j>=n;j--){
               dp[j]=dp[j]||dp[j-n];
           }
       }
       return dp[sum];
    }
}