class Solution {
    public int[] replaceElements(int[] arr) {
        int maxVal = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for ( int i=arr.length-2; i>=0; i-- ) {
            int prevMax = maxVal;
            maxVal = Math.max(maxVal, arr[i]);
            arr[i] = prevMax; 
        }
        return arr;
    }
}