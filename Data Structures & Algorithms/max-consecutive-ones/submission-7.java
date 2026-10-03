class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int count = 0;
        int max = 0;

        while (i < n) {
            while(i < n && nums[i] == 1) {
                count++;
                i++;
            }
            max = Math.max(max, count);
            count = 0;
            i++;
        }
        return max;
    }
}