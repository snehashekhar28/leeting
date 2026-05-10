class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] trackerArray = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            trackerArray[i] = new int[]{i, nums[i]};
        }
        Arrays.sort(trackerArray, (a,b) -> Integer.compare(a[1], b[1]));
        int l = 0;
        int r = nums.length - 1;
        while (r > l){
            int ans = trackerArray[l][1] + trackerArray[r][1];
            if(ans == target){
                return new int[]{trackerArray[l][0], trackerArray[r][0]};
            } else if (ans > target) r--;
            else l++;
        }
        return new int[]{-1,-1};

    }
}