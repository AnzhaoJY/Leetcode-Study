class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        char tmp = 0;
        String ans = "";
        
        for (int i = 0 ; i < len ; i++){
            tmp = s.charAt(i);
            if (('0' <= tmp && tmp <= '9') || ('a' <= tmp && tmp <= 'z') || ('A' <= tmp && tmp <= 'Z' )) ans += tmp;
            else continue;
        }
        int newlen = ans.length();
        ans = ans.toLowerCase();
        for (int i = 0 ; i < newlen / 2 ; i++) {
            if (ans.charAt(i) == ans.charAt(newlen - 1 - i)) continue;
            else return false;
        }
        return true;
    }
}
