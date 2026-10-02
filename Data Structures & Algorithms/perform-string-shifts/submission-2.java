class Solution {
    public String stringShift(String s, int[][] shift) {
        int p = 0;
        for (int i = 0; i < shift.length; i++) {
            int[] cur = shift[i];

            if (cur[0] == 0) {
                for (int j = 0; j < cur[1]; j++) {
                    if (p == s.length() - 1) {
                        p = 0;
                    } else {
                        p++;
                    }
                }
            } else {
                for (int j = 0; j < cur[1]; j++) {
                    if (p == 0) {
                        p = s.length() - 1;
                    } else {
                        p--;
                    }
                }
            }
        }
        String ans = "";
        for (int j = 0; j < s.length(); j++) {
            ans += s.charAt(p);
            if (p == s.length() - 1) {
                p = 0;
            } else {
                p++;
            }
        }
        return ans;
    }
}
