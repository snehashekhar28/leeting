class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        char[] chArr = s.toCharArray();
        Map<Character, Integer> chSet = new HashMap<>();
        int l = 0;
        int r = 1;
        chSet.put(chArr[l],l);
        int maxLen = 1;
        int tempLen = 1;
        while(r < chArr.length){

            if(!chSet.containsKey(chArr[r])){
                chSet.put(chArr[r], r);
                tempLen++;
                r++;
            }
            else{
                System.out.println("reset?");
                maxLen = Math.max(maxLen, tempLen);
                l = chSet.get(chArr[r]) + 1;
                r = l+1;
                chSet = new HashMap<>();
                chSet.put(chArr[l],l);
                tempLen = 1;
            }
        }
        return Math.max(maxLen, tempLen);
    }
}