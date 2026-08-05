class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int index = 0;
        while ( index < s.length()-1 ) {
            int a = s.charAt(index);
            int b = s.charAt(index+1);
            sum += Math.abs(a-b);
            index++;
        }
        return sum;
    }
}