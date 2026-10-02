class Solution {
    public int countElements(int[] arr) {

        Set<Integer> arrSet = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSet.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arrSet.contains(arr[i] + 1)) {
                count++;
            }
        }
        return count;
        
    }
}
