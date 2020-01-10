class Solution {
    public int strStr(String haystack, String needle) {
        int haylen = haystack.length();
        int neelen = needle.length();
        if ( neelen == 0 ) return 0;//for '' input of needle
        
        char haytmp = ' ';
        char neetmp = needle.charAt(0);//start with first char in needle
        int ans = 0;
        
        for ( int i = 0 ; i < haylen ; i++ )
        {
            haytmp = haystack.charAt(i);
            if ( haytmp != neetmp ) continue;// end just before the strstr
            else if ( neelen > 1 )
            {
                for ( int j = 1 ; j < neelen ; j++ )
                {   ans = i;
                    if ( i + j >= haylen ) return -1;
                    if ( haystack.charAt(i + j) == needle.charAt(j) ) 
                    {
                        if ( j + 1 == neelen ) return ans;
                        else continue;
                    }
                    else 
                    {
                        break;
                    }
                }
            }
            else return ans; // if needle only length 1
        }
        return -1;
    }
}
