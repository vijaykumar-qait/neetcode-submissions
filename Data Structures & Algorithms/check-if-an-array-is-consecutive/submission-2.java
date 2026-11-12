class Solution {
    public boolean isConsecutive(int[] nums) {
                int minValue = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for ( int i=0; i<nums.length; i++ ) {
            minValue = minValue > nums[i] ? nums[i] : minValue;
            if (!set.add(nums[i])) return false;
        }
        for ( int i = minValue; i<minValue+nums.length; i++ ) {
            if (! set.contains(i)) {
                return false;
            }
        }
        return true;

    }
}
