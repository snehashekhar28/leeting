class Solution {
    public int firstUniqChar(String s) {
        //o(n^2)
        //o(n) -> store letters in a tracker and then check which ones are solo
        char[] sArr = s.toCharArray();
        int[] tracker = new int[26];
        for(int i = 0; i < sArr.length; i++){
            int count = tracker[sArr[i]-'a'];
            tracker[sArr[i] - 'a'] = ++count;
        }
        for(int i = 0; i < sArr.length; i++){
            if(tracker[sArr[i] - 'a'] == 1) return i;
        }
        return -1;
    }
}