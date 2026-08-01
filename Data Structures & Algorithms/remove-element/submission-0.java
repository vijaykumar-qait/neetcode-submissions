class Solution {
    public int removeElement(int[] nums, int val) {
        int nonValIndex = 0;
        for ( int i=0; i<nums.length; i++ ) {
            if ( nums[i] != val ) {
                swap(nums, i, nonValIndex);
                nonValIndex++;
            }
        }
        return nonValIndex;
    }

    public void swap( int[] nums, int i, int j ) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}