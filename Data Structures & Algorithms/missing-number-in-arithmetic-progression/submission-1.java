class Solution {
    public int missingNumber(int[] arr) {
        int arrSize = arr.length;
        int arithmeticsum = ((arrSize+1)*(arr[0]+arr[arrSize-1]))/2;
        int arrSum = 0;
        for ( int num : arr ) {
            arrSum += num;
        }

        return arithmeticsum - arrSum;
    }
}
