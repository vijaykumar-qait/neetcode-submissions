class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] squareNums = new int[nums.length];
        int index = squareNums.length - 1;

        while ( left<=right ) {
            if ( Math.abs(nums[left]) > Math.abs(nums[right]) ) {
                squareNums[index] = nums[left]*nums[left];
                left++;
            }
            else {
                squareNums[index] = nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return squareNums;
    }
}