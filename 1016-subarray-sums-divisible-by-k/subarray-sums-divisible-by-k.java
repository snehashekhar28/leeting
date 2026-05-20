class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            nums[i] %= k;
        }
        int run = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            run = (run + nums[i]) % k;
            if(run < 0) run += k;
            if(run % k == 0) count++;
            if(map.get(run) != null) count+= map.get(run);
            map.put(run, map.getOrDefault(run,0)+1);
        }
        return count;
    }
}