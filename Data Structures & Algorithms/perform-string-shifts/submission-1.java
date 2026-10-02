class Solution {
    public String stringShift(String s, int[][] shift) {
        for ( int arr[] : shift ) {
            int direction = arr[0];
            int timesShift = arr[1];
            if ( timesShift > s.length() ) {
                timesShift %= s.length();
            }
            if ( direction == 0 ) {
                String stringLeft = s.substring(0, timesShift);
                String stringRight = s.substring( stringLeft.length() );
                s = stringRight + stringLeft;
            }
            else {
                String stringLeft = s.substring(0, s.length() - timesShift);
                String stringRight = s.substring(stringLeft.length() );
                s = stringRight + stringLeft;
            }
        }
        return s;
    }
}
