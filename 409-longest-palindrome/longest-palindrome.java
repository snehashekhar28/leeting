class Solution {
    public int longestPalindrome(String s) {
        //add up everything that makes even count... can add 1 odd count as well!
        Map <Character, Integer> trackCount = new HashMap<>();
        for(char c: s.toCharArray()){
            Integer cNum = trackCount.get(c);
            if(cNum == null){
                cNum = 0;
            }
            trackCount.put(c, ++cNum);
        }
        int palindromeLen = 0;
        int leftover = 0;
        for(Character c : trackCount.keySet()){
            palindromeLen += trackCount.get(c) - (trackCount.get(c) % 2);
            leftover+= trackCount.get(c) % 2;
        }
        if(leftover > 0) palindromeLen++;
        return palindromeLen;
    }
}