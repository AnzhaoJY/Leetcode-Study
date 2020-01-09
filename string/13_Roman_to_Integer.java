class Solution {
    public int romanToInt(String s) {
        int length = s.length();
        int sum = 0;
        
        //int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        
        for (int i=0;i<length;i++){
            if(s.charAt(i)=='I') sum += 1;
            else if (s.charAt(i)=='V') sum += 5;
            else if (s.charAt(i)=='X') sum += 10;
            else if (s.charAt(i)=='L') sum += 50;
            else if (s.charAt(i)=='C') sum += 100;
            else if (s.charAt(i)=='D') sum += 500;
            else if (s.charAt(i)=='M')sum += 1000;
        }
        
        if (s.contains("IV")) sum -=2;
        if (s.contains("IX")) sum -=2;
        if (s.contains("XL")) sum -=20;
        if (s.contains("XC")) sum -=20;
        if (s.contains("CD")) sum -=200;
        if (s.contains("CM")) sum -=200;
        
    return sum;
    }
}
