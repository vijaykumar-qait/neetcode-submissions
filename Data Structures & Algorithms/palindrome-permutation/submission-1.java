class Solution {
    public boolean canPermutePalindrome(String s) {
        int count = 0;

        int[] map = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map[c - 'a'] == 0) {
                map[c - 'a']++;
                count++;
            } else {
                map[c - 'a']--;
                count--;
            }
        }
        return count <= 1;
    }
}
