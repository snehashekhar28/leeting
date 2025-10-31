class Solution {
    public int firstMissingPositive(int[] nums) {
        //first approach: go from 1-> int.max and check if they're in the array -> LOL crazy
        Arrays.sort(nums);
        //0 1 2
        int numWanted = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == numWanted){
                numWanted++;
            }
        }
        return numWanted;
    }
}