class Solution {
    public int longestConsecutive(int[] nums) {
        //4 95 5 9 10 93 11 6 100 97 8 90 94 92 96
        //4 5 6 | 8 10 11 | 88 | 92 93 94 95 96 97
        Set<Integer> numSet = new HashSet<>();
        for(int n: nums){
            numSet.add(n);
        }
        //fast lookups ^^
        int maxCt = 0;
        for(int n: numSet){
            int ct = 1;
            if(numSet.contains(n - 1)) continue;
            //found the start
            int nT = n;
            while(numSet.contains(nT+1)){
                ct++;
                nT++;
            }
            if(maxCt < ct) maxCt = ct;
        }
        return maxCt;
    }
}