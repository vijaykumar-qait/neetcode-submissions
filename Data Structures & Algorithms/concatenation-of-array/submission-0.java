class Solution {
    public int[] getConcatenation(int[] nums) {
        int arrSize = nums.length;
        int concatArr[] = new int[arrSize * 2];
        for ( int i=0; i < arrSize; i++ ) {
            concatArr[i] = nums[i];
            concatArr[i+arrSize] = nums[i];
        }
        return concatArr;
    }
}