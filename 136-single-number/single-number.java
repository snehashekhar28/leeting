class Solution {
    public int singleNumber(int[] nums) {
        int bitOps = nums[0];
        for(int i = 1; i < nums.length; i++){
            bitOps^=nums[i];
        }
        return bitOps;
    }
}