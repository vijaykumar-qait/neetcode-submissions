class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int largestUniqueNumber = -1;
        for (int num : nums) {
           map.merge(num, 1, Integer::sum);
        }

        for ( Map.Entry<Integer, Integer> entry : map.entrySet() ) {
            if ( entry.getValue() == 1 ) {
                largestUniqueNumber = largestUniqueNumber<entry.getKey() ? entry.getKey() : largestUniqueNumber;
            }
        }

        return largestUniqueNumber;
    }
}
