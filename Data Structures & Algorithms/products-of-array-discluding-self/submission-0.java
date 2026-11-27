class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
    int[] productNums = new int[n];
    int totalProduct = 1;
    int zeroCount = 0;

    for (int num : nums) {
        if (num == 0) zeroCount++;
        else totalProduct *= num;   // product of non-zero elements only
    }

    if (zeroCount >= 2) {
        // already all zeros
        return productNums;
    }

    if (zeroCount == 1) {
        for (int i = 0; i < n; i++) {
            productNums[i] = (nums[i] == 0) ? totalProduct : 0;
        }
        return productNums;
    }

    // no zeros — division is safe
    for (int i = 0; i < n; i++) {
        productNums[i] = totalProduct / nums[i];
    }
    return productNums;
    }
}  
