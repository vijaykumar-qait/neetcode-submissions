class Solution {
    public String mergeAlternately(String word1, String word2) {
        int index1 = 0;
        int index2 = 0;
        StringBuilder newStr = new StringBuilder();
        while ( index1 < word1.length() && index2 < word2.length() ) {
            newStr.append(word1.charAt(index1++));
            newStr.append(word2.charAt(index2++));
        }
        if ( index1 == word1.length() ) {
            newStr.append(word2.substring(index2));
        }
        else {
            newStr.append(word1.substring(index1));
        }
        return newStr.toString();
    }
}