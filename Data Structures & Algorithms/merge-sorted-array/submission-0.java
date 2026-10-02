class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        int num1Index = m-1;
        int num2Index = n-1;
        while ( num1Index>=0 && num2Index >= 0 ) {
            if ( nums1[num1Index] >= nums2[num2Index] ) {
                nums1[index] = nums1[num1Index];
                num1Index--;
            }
            else {
                nums1[index] = nums2[num2Index];
                num2Index--;
            }
            index--;
        }

        if ( num1Index<0 ) {
            while ( num2Index>= 0 ) {
                nums1[index--] = nums2[num2Index--];
            }
        }
    }
}