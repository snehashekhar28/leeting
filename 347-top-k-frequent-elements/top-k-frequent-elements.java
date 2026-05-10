class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        for(int n: nums){
            Integer l = freq.get(n);
            if(l == null) l = 0;
            freq.put(n, ++l);
            if(l > maxFreq) maxFreq = l;
        }
        // PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b) -> (a.getValue() - b.getValue()));
        // for(Map.Entry<Integer, Integer> me : freq.entrySet()){
        //     heap.add(me);
        //     if(heap.size() > k){
        //         heap.poll();
        //     }
        // }
        // int[] nArr = new int[k];
        // for(int i = 0; i < k; i++){
        //     nArr[i] = heap.poll().getKey();
        // }
        // return nArr;
        

        //make a bucket array of indices/ frquencies <-> list of 
        ArrayList<Integer>[] bucket = new ArrayList[maxFreq + 1];
        for(Map.Entry<Integer, Integer> i : freq.entrySet()){
            ArrayList<Integer> al = bucket[i.getValue()];
            if(al == null) al = new ArrayList<>();
            al.add(i.getKey());
            bucket[i.getValue()] = al;
        }
        int[] ans = new int[k];
        int count = 0;
        int iter = bucket.length-1;
        while(count < k){
            if(bucket[iter] != null){
                for(int j = 0; j < bucket[iter].size(); j++){
                    ans[count] = bucket[iter].get(j);
                    count++;
                }
            }
            iter --;
        }
        return ans;
    }
}