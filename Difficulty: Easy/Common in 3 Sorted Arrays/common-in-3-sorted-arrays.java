// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
         Set<Integer> set1 = new HashSet<>(arr1);
        Set<Integer> set2 = new HashSet<>(arr2);
        Set<Integer> set3 = new HashSet<>(arr3);

        // Find common elements between set1 and set2
        set1.retainAll(set2);

        // Find common elements with set3
        set1.retainAll(set3);

        // Convert set to list and sort it if needed
        List<Integer> res = new ArrayList<>(set1);
        Collections.sort(res);
        return res;
    }
}