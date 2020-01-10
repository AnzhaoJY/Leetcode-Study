class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        char tmp = 0;
        int ans = 0;
        for ( int i = 0 ; i < len ; i++ )
        {
            tmp = s.charAt(i);
            if ( tmp != ' ' ) count++;
            else count = 0;
            if ( count > ans ) ans = count;
        }
        return ans;
    }
}
