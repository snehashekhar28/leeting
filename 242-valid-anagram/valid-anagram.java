class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        //Map <Character, Integer> count 
        //array: fixed size
        //'a' -> 3
        int[] charCount = new int[26];
        //anagram
        for(char l : s.toCharArray()){
            int idx = l - 'a';
            charCount[idx]++;
        }

        for(char l : t.toCharArray()){
            int idx = l - 'a';
            charCount[idx]--;
            if(charCount[idx] < 0) return false;
        }

        for(int i = 0; i < charCount.length; i++){
            if(charCount[i] != 0) return false;
        }

        return true;

    }
}