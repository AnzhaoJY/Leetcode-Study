class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int num = strs.length;//from 0 to num-1,[.length for array]
        String sh =" ";
        if (num>0) sh = strs[0];//for the shortest word
        if (num==0) return ans;
        
        //traverse the string and try to find the common prefix
        String pr="";
        boolean have = true;
        
        for (int k=0;k<sh.length();k++){
            if (have) pr=pr+sh.charAt(k);
            //get a new char or add next one
            
            for (int p=0;p<num;p++){
                if(k>=strs[p].length())return ans;
                if (strs[p].charAt(k)!=pr.charAt(0)) have = false;//check if all elements have the string pr.
            }
            
           if (have) {
            ans=ans+pr;//save the longest pr
            pr="";}
            else return ans;
       
        }
    
        return ans;
    }
}
