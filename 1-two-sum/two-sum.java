class Solution {
    public int[] twoSum(int[] nums, int target) {
        //store both index & value 
            //goal: linear time. 
                //two-pointer approach
                //hashmap **
        Map<Integer, Integer> numsDict = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer ans = numsDict.get(target-nums[i]);
            if(ans != null)
                return new int[] {ans, i};
            numsDict.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}