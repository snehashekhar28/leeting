class Solution {
    public int climbStairs(int n) {
        int[] storage = new int[n+1];
        if(n == 1 || n == 2) return n;
        storage[0] = 0;
        storage[1] = 1;
        storage[2] = 2; 
        for(int i = 3; i < storage.length; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }
}