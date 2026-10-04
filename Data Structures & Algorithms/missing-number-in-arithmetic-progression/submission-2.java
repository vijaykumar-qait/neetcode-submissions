class Solution {
    public int missingNumber(int[] arr) {
        int total = ((arr.length + 1) * (arr[0] + arr[arr.length-1]))/2;
        int sum = 0;

        for (int a : arr) {
            sum += a;
        }
        return total - sum;
    }
}
