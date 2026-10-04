class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int startIndex = 0;
        int moveIndex = 0;
        Set<Integer> set = new HashSet<>();
        while ( moveIndex < nums.length ) {
            if ( moveIndex - startIndex > k ) {
                set.remove(nums[startIndex]);
                startIndex++;
            }
            if ( set.contains(nums[moveIndex]) ) {
                return true;
            }
            set.add(nums[moveIndex]);

            moveIndex++;
        }
        return false;
    }
}