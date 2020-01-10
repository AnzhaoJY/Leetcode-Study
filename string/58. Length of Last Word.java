class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length();
        int count = 0;
        char tmp = 0;        
        if ( len == 0 ) return 0;
        for ( int i = 1 ; i <= len ; i++ )
        {
            tmp = s.charAt(len - i);
            if ( tmp != ' ' ) count++;
            else break;
        }
        return count;
    }
}
