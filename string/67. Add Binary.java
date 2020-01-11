class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int alen = a.length();
        int blen = b.length();
        int maxlen = 0;
        char atmp = 0;
        char btmp = 0;
        char anstmp = 0;
        char rem = 0;
        char remover = '0';
        
        if ( alen > blen ) maxlen = alen;
        else maxlen = blen;//find the longest length
        
        for ( int i = 1 ; i <= maxlen ; i++ ){
            if ( i <= alen ) atmp = a.charAt(alen - i);
            else atmp = '0';//make sure atmp have all the char or 0
            if ( i <= blen ) btmp = b.charAt(blen - i);
            else btmp = '0';//btmp same as atmp
            if ( atmp == '0' && btmp == '0' ) {
                anstmp = '0';
                rem = '0';
            }
            else if ( atmp == '1' && btmp == '0' ) {
                anstmp = '1';
                rem = '0';
            }
            else if ( atmp == '1' && btmp == '1' ) {
                anstmp = '0';
                rem = '1';
            }
            else if ( atmp == '0' && btmp == '1' ) {
                anstmp = '1';
                rem = '0';
            }
            if ( remover == '0' ){
                if ( anstmp == '0' && rem == '0' ) {
                    ans = ans + '0';
                    remover = '0';
                }
                else if ( anstmp == '1' && rem == '0' ) {
                    ans = ans + '1';
                    remover = '0';
                }
                else if ( anstmp == '0' && rem == '1' ) {
                    ans = ans + '0';
                    remover = '1';
                }
                }
            else {
                if ( anstmp == '0' && rem == '0' ) {
                    ans = ans + '1';
                    remover = '0';
                }
                else if ( anstmp == '1' && rem == '0' ) {
                    ans = ans + '0';
                    remover = '1';
                }
                else if ( anstmp == '0' && rem == '1' ) {
                    ans = ans + '1';
                    remover = '1';
                }
            }
            if ( remover == '1' && i == maxlen ) ans = ans + '1';
        }
        return reverse(ans);
    }
    public String reverse(String s){
        int len = s.length();
        char tmp = 0;
        String ans = "";
        for ( int i = len - 1 ; i >= 0 ; i-- ) ans += s.charAt(i);
        return ans;
    }
        
}
