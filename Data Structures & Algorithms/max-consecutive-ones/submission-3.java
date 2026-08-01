class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if ( nums.length == 1 ) {
            return nums[0] == 0 ? 0 : 1;
        }
        int index=0;
        while(index<nums.length && nums[index] != 1) {
            index++;
        }
        int start = index;
        int end = start + 1;
        int maxLength = 0;
        while ( end < nums.length ) {
            while ( end < nums.length && nums[end] != 0 ) {
                end++;
            }
            maxLength = Math.max(maxLength, (end - start));
            start = end;
            while ( start < nums.length && nums[start] != 1 ) {
                start++;
            }
            end = start + 1;
        }
        return maxLength;
    }
}