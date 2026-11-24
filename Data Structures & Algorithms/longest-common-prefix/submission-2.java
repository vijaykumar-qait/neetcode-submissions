class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortest = strs[0];
        for (String s : strs) {
            if (s.length() < shortest.length()) shortest = s;
        }

        for (int i = 0; i < shortest.length(); i++) {
            char c = shortest.charAt(i);
            for (String s : strs) {
                if (i >= s.length() || s.charAt(i) != c) {
                    return shortest.substring(0, i);
                }
            }
        }
        return shortest;
    }
}