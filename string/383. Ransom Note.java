class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ranlen = ransomNote.length();
        for ( int i = 0 ; i < ranlen ; i++){
            char tmp = ransomNote.charAt(i);
            if (num(ransomNote, tmp) <= num(magazine, tmp)) continue;
            else return false;
        }
        return true;
    }
    public int num(String s, char c){
        int len = s.length();
        int count = 0;
        for ( int i = 0 ; i < len ; i++){
            if (s.charAt(i) == c) count++;
        }
        return count;
    }
}



best ans:(copy)
class Solution {
    
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineChars = new int[26];
        
        // O(M)
        for (char m : magazine.toCharArray()) {
            magazineChars[m - 'a']++;
        }
        
        // O(R)
        for (char r : ransomNote.toCharArray()) {
            magazineChars[r - 'a']--;
            
            if (magazineChars[r - 'a'] < 0)
                return false;
        }
        
        return true;
    }
    
}
