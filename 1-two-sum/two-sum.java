class Solution {
    public int[] twoSum(int[] nums, int target) {
        //return index of the two numbers that add up to the target
        //make hashmap -> # : index

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numMap.containsKey(target-nums[i])){
                numMap.put(nums[i],i);
            } else return new int[] {numMap.get(target-nums[i]), i};
        }
        return new int[] {-1,-1};
    }
}