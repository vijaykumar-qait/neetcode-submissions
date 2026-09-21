class Solution {
    public boolean isSubsequence(String s, String t) {
        if ( s.length() > t.length() ) {
            return false;
        }
        int tIndex = 0;
        for ( char sChar : s.toCharArray() ){
            while ( tIndex < t.length() && t.charAt(tIndex) != sChar ) {
                tIndex++;
            }
            if ( tIndex >= t.length() ) {
                return false;
            }
            tIndex++;
        }

        return true;
    }
}