class Solution {
    Map<Integer,Integer> tracker;
    int zeros;
    int m, n;
    Random rand;
    public Solution(int m, int n) {
        this.rand = new Random();
        zeros = m * n;
        tracker = new HashMap<>();
        this.m = m;
        this.n = n;
    }
    
    public int[] flip() {
        int picked = rand.nextInt(zeros);
        int actual = tracker.getOrDefault(picked, picked);
        zeros--;
        int repl = tracker.getOrDefault(zeros, zeros);
        tracker.put(picked, repl);
        return new int[]{actual / n, actual %n};
    }
    
    public void reset() {
        tracker.clear();
        zeros = m * n;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */