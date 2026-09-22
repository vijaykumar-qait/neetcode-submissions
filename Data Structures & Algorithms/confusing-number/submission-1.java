class Solution {
    public boolean confusingNumber(int n) {
        int tempN = n;
        int rotated = 0;
        while ( tempN>0 ) {
            int d = tempN%10;
            if ( d == 2 || d == 3 || d == 4 || d ==5 || d ==7 ){
                return false;
            }
            if( d == 6 ) d = 9;
            else if ( d == 9 ) d = 6;
            rotated = rotated*10 + d;
            tempN /= 10;
        }
        return rotated != n;
    }
}
