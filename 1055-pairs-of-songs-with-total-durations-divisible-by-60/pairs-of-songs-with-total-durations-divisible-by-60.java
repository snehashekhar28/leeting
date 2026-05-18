class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] map = new int[60];
        int count = 0;
        for(int i = 0; i < time.length; i++){
            if(time[i]%60 == 0) count+= map[0];
            else count+= map[60 - time[i]%60];
            map[time[i]%60]++;
        }
        return count;
    }
}