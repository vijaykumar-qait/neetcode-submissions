class Solution {
    public int missingNumber(int[] arr) {
        int total = ((arr.length + 1) * (arr[0] + arr[arr.length-1]))/2;
        
        return total - Arrays.stream(arr).sum();
    }
}
