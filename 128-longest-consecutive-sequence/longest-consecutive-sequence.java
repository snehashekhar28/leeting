class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> numS = new HashSet<>();
        int maxCt = 0;
        for(int i = 0; i < nums.length; i++){
            numS.add(nums[i]);
        }
        List<Integer> numL = new ArrayList<>();
        for(int num: numS){
            if(!numS.contains(num - 1)) numL.add(num);
        }
        for(int i = 0; i < numL.size(); i++){
            int ct = 1;
            int toGet = numL.get(i) + 1;
            while(numS.contains(toGet)){
                ct++;
                toGet++;
            }
            if(maxCt < ct) maxCt = ct;
        }
        return maxCt;
    }
}