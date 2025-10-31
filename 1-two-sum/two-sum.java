class Solution {
    public int[] twoSum(int[] nums, int target) {
        //SUB-OPTIMAL: nested for loop
        //two pointer approach = works best when sorted
        //hash map! 2:7
                //  7:2
        HashMap<Integer,Integer> twoMap = new HashMap <Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(twoMap.containsKey(target - nums[i])){
                return new int[] {twoMap.get(target-nums[i]), i};
            }
            twoMap.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}