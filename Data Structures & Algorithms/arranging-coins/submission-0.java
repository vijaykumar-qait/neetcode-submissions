class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int stair = 1;
        if ( n == 1 ) {
            return 1;
        }
        while ( n > stair ) {
            n = n - stair;
            count++;
            stair++;
        }
        return count;
    }
}