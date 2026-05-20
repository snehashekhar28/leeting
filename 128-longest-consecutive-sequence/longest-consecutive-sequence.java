class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> numS = new HashSet<>();
        int maxCt = 0;
        for(int i = 0; i < nums.length; i++){
            numS.add(nums[i]);
        }
        for(int num : numS){
            int ct = 0;
            if(!numS.contains(num + 1)){
                int toGet = num - 1;
                while(numS.contains(toGet)){
                    ct++;
                    toGet--;
                }
            }
            if(ct > maxCt) maxCt = ct;
        }
        return maxCt + 1;
    }
}