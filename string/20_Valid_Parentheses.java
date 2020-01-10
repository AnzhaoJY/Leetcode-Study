class Solution {
    public boolean isValid(String s) {
        Stack<Character> mystack = new Stack<>();//creat a stack
        int num = s.length();
        int left = 0;//left length of the parenthese       
        if ( num % 2 != 0 ) return false;// odd number must be wrong
        if ( num == 0 ) return true;  
        if ( s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;
        
        for ( int i = 0 ; i < num ; i++ )
        {
            char c = s.charAt(i);
            if ( s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ) mystack.push(s.charAt(i));
            else 
            {
                char tmp = mystack.pop();
                if (tmp == '(' && c == ')') continue;
                else if (tmp == '[' && c == ']') continue;
                else if (tmp == '{' && c == '}') continue;
                else return false;
            }
        } 
        if ( mystack.size() == 0 ) return true;
        else return false;
    }
}
