class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] squareNums = new int[nums.length];
        int index = squareNums.length - 1;

        while ( left<=right ) {
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if ( leftSquare > rightSquare ) {
                squareNums[index] = leftSquare;
                left++;
            }
            else {
                squareNums[index] = rightSquare;
                right--;
            }
            index--;
        }
        return squareNums;
    }
}