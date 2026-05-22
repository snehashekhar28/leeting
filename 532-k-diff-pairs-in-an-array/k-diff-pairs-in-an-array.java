class Solution {
    public int findPairs(int[] nums, int k) {
        int ct = 0;
        if (k == 0){
            Map<Integer, Integer> hs = new HashMap<>();
            for(int n: nums){
                hs.put(n,hs.getOrDefault(n,0) + 1);
            }
            for(int n : hs.keySet()){
                if(hs.get(n) > 1){
                    ct++;
                }
            }
        }
        else{
            Set<Integer> s = new HashSet<>();
            for(int n : nums) s.add(n);
            for(int n : s) if(s.contains(n+k)) ct++;
        }
        return ct;
    }
}