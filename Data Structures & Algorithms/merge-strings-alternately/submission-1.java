class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p = 0;
        StringBuilder sb = new StringBuilder();

        while (p < word1.length() && p < word2.length()) {
            sb.append(word1.charAt(p)).append(word2.charAt(p));
            p++;
        }
        if (word1.length() > word2.length()) {
            sb.append(word1.substring(p, word1.length()));
        } else {
            sb.append(word2.substring(p, word2.length()));
        }
        return sb.toString();
    }
}