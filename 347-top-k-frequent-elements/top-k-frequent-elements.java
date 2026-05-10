class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n: nums){
            Integer l = freq.get(n);
            if(l == null) l = 0;
            freq.put(n, ++l);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b) -> (a.getValue() - b.getValue()));
        for(Map.Entry<Integer, Integer> me : freq.entrySet()){
            heap.add(me);
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] nArr = new int[k];
        for(int i = 0; i < k; i++){
            nArr[i] = heap.poll().getKey();
        }
        return nArr;
    }
}