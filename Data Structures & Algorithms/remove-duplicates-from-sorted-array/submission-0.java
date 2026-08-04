class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int nonDuplicateIndex = 1;
        int val = nums[0];

        while ( index < nums.length ) {
            if ( nums[index] != val ) {
                nums[nonDuplicateIndex] = nums[index];
                val = nums[index];
                nonDuplicateIndex++;
            }
            index++;
        }
        return nonDuplicateIndex;
    }
}