class Solution {
    public int rob(int[] nums) {
        //first intuition: @ the index, should we or should we not rob this house to maximize profits
            //blocker: adjacency -> nums[i] + non-adjacent prev = nums[i] + profitMax[i-2]
            //         not taking -> adjacent prev = profitMax[i - 1]
        //second intuition: given recursion/ dp intuition
            //-> up to the current point
        
        int [] profitMax = new int[nums.length];
        if(nums.length <= 1) return nums[nums.length-1]; 
        profitMax[0] = nums[0];
        profitMax[1] = Math.max(nums[1], nums[0]);
        for(int i = 2; i < nums.length; i++){
            profitMax[i] = Math.max(nums[i] + profitMax[i-2], profitMax[i-1]);
        }
        return profitMax[nums.length-1];
    }
}