class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        for ( int i = n ; i > 1 ; i-- ) ans = read(ans);
        return ans;
    }
    
    public String read(String s){
        int len = s.length();
        String ans = "";
        int count = 1;
        
        for ( int i = 0 ; i < len ; i++ ){
            //一样count+1，不一样更新tmp
            char say = s.charAt(i);            
            if ( i + 1 < len && say == s.charAt(i + 1 ) ) count++;
            else {
                ans = ans + Integer.toString(count) + say;
                //update the tmp with next integer and reset the count with 1
                count = 1;               
            }
        }
        return ans;
    }
}
