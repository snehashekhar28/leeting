class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preNums = new int[nums.length];
        int[] postNums = new int[nums.length];
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            preNums[i] = 1;
            postNums[i] = 1;
        }
        int runningPre = 1;
        int runningPost = 1;
        for(int i = 1; i < nums.length; i++){
            runningPre *= nums[i-1];
            preNums[i] *= runningPre;
            System.out.println("pre:" + i + " " + preNums[i]);
        }
        for(int i = nums.length-2; i >= 0; i--){
            runningPost *= nums[i+1];
            postNums[i] *= runningPost;
            System.out.println("post:" + i + " " + postNums[i]);
        }
        // output[0] = runningPost[0];
        // output[nums.length-1] = runningPre[nums.length-1];
        for(int i = 0; i < output.length; i++){
            output[i] = postNums[i] * preNums[i];
        }
        return output;
    }
}