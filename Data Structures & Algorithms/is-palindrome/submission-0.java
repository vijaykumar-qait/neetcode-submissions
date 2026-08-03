class Solution {
    public boolean isPalindrome(String s) {
        char[] strArr = s.toCharArray();
        int left = 0;
        int right = strArr.length - 1;

        while ( left <= right ) {
            if ( isCharOrNum(strArr[left]) && 
            isCharOrNum(strArr[right]) && 
            Character.toLowerCase(strArr[left]) ==      Character.toLowerCase(strArr[right]) ) {
                left++;
                right--;
            }
            else if ( !isCharOrNum(strArr[left]) ) {
                left++;
            }
            else if ( !isCharOrNum(strArr[right]) ) {
                right--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public boolean isCharOrNum(char ch) {
        if ( ( ch >= 'A' ) && (ch <= 'Z') || 
        ( ch >= 'a' ) && (ch <= 'z') ||
        ( ch >= '0' ) && (ch <= '9') ) {
            return true;
        }

        return false;
    }
}
