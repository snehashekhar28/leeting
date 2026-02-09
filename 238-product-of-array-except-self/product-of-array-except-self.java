class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            preNums[i] = 1;
        }
        int runningPre = 1;
        int runningPost = 1;
        for(int i = 1; i < nums.length; i++){
            runningPre *= nums[i-1];
            preNums[i] *= runningPre;
        }
        for(int i = nums.length-2; i >= 0; i--){
            runningPost *= nums[i+1];
            preNums[i] *= runningPost;
        }
    
        return preNums;
    }
}