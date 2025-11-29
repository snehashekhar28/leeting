class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        Map<Character, Integer> seen = new HashMap<>();
        while(r < s.length() && r >= l){
            if(seen.containsKey(s.charAt(r)) && seen.get(s.charAt(r)) >= l){
                l = seen.get(s.charAt(r)) + 1;
            }
            seen.put(s.charAt(r), r);
            int len = r - l + 1;
            r++;
            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}