class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer, Integer> dict = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(dict.get(sum - k)!= null) 
                count+= dict.get(sum - k);
            dict.put(sum, dict.getOrDefault(sum,0) + 1);
        }
        if(dict.get(k)!= null) 
            count+= dict.get(k);
        return count;
    }
}