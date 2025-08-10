class Solution {
    public static long sumOfDivisors(long n) {
        // code here
        if(n==1)
        return 1;
        long s=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            if(i%j==0){
                s+=j;
            }
            }
        }
    return s;
    }
}