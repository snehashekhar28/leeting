class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        Map<Character, Integer> lastIndex = new HashMap<>();
        int maxLen = 0;
        int l = 0; // left pointer

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (lastIndex.containsKey(c) && lastIndex.get(c) >= l) {
                // move left pointer just past the previous occurrence
                l = lastIndex.get(c) + 1;
            }

            // update last seen index of this character
            lastIndex.put(c, r);

            // window [l..r] length
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}
