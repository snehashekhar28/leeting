class Solution {
    public int[] twoSum(int[] nums, int target) {
        //two pointer method
        int[] nums2 = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            nums2[i] = nums[i];
        }
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        while (r > l && l < nums.length){
            int add = nums[l] + nums[r];
            if(add == target){
                int numL = -1;
                int numR = -2;
                for(int i = 0; i < nums.length; i++){
                    if(nums[l] == nums2[i] && numL == -1) numL = i;
                    if(nums[r] == nums2[i] && i != numL) numR = i;
                }
                return new int[] {numL, numR};
            }
            else if(add < target) l++;
            else  r--;
        }
        return new int[] {-1,-1};
    }
}
