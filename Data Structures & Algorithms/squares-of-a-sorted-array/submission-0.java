class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] squareNums = new int[nums.length];
        int index = squareNums.length - 1;

        while ( left<=right ) {
            if ( Math.abs(nums[left]) > Math.abs(nums[right]) ) {
                squareNums[index] = (int)Math.pow(nums[left], 2);
                left++;
            }
            else {
                squareNums[index] = (int)Math.pow(nums[right], 2);
                right--;
            }
            index--;
        }
        return squareNums;
    }
}