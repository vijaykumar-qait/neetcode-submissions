class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        if ( target < nums[left] || target>nums[right]) {
            return target<nums[left] ? 0 : nums.length;
        }
        while ( left <= right ) {
            int mid = ( left + right ) / 2;
            if ( target == nums[mid] || nums[mid]>target) {
                ans = mid;
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return ans;
    }
}