class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = Integer.MAX_VALUE;
        String longestCommonPrefixStr = "";

        for ( String str : strs ) {
            if ( str.length() < size ) {
                size = str.length();
                longestCommonPrefixStr = str;
            }
        }
        String longestCommonPrefix = "";
        for ( char ch : longestCommonPrefixStr.toCharArray() ) {
            String longestCommonPrefixTemp = longestCommonPrefix + ch;

            for ( String str : strs ) {
                if (! str.substring(0, longestCommonPrefixTemp.length()).equals(longestCommonPrefixTemp)) {
                    return longestCommonPrefix;
                }
            }

            longestCommonPrefix = longestCommonPrefixTemp;

        }

        return longestCommonPrefix;
    }
}