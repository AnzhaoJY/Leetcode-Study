 public String longestCommonString(String[] strs) {
        String ans = "";
        int num = strs.length;//from 0 to num-1,[.length for array]
        String sh =" ";
        if (num>0) sh = strs[0];//for the shortest word
        if (num==0) return ans;
        //find the shortest word,[.length()for string]
        for(int j=0;j<num;j++){
            if(sh.length()<strs[j].length())sh=strs[j];
        }
        
        //traverse the string and try to find the common prefix
        String pr=" ";
        boolean have = true;
        
        for (int k=0;k<sh.length();k++){
            if (pr==" ") pr=Character.toString(sh.charAt(k));
            //get a new char or add next one
            else pr=pr+sh.charAt(k);
            
            for (int p=0;p<num;p++){
                if (!strs[p].contains(pr)) have = false;//check if all elements have the string pr.
            }
            
            if (have&&pr.length()>=ans.length()) ans=pr;//save the longest pr
            else pr=" ";
            
        }
        
        return ans;
    }
