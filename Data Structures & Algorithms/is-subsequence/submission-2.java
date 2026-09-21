class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        for ( int j=0; j<t.length() && sIndex<s.length(); j++ ) {
            if ( s.charAt(sIndex) == t.charAt(j) ) {
                sIndex++;
            }
        }
        return sIndex == s.length();
    }
}