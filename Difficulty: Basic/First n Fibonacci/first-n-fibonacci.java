// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int a[]=new int[n];
        a[0]=0;
        if(n==1){
            return a;
        }
        a[1]=1;
        if(n==2){
            return a;
        }
        int f=0,s=1;
        for(int i=2;i<n;i++){
            int t=f+s;
            a[i]=t;
            f=s;
            s=t;
        }
        return a;
        
    }
}