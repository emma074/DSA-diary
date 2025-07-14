class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        for(int n:arr){
            if(n==k){
                return true;
            }
        }
        return false;
    }
}