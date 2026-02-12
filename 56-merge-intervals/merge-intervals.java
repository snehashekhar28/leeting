class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if(a[0] != b[0]) return Integer.compare(a[0], b[0]);
            else return Integer.compare(a[1], b[1]);
        });
        List<int[]> mergeList = new ArrayList<>();
        mergeList.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            if(mergeList.get(mergeList.size() - 1)[1] >= intervals[i][0]) mergeList.get(mergeList.size() - 1)[1] = Math.max(intervals[i][1], mergeList.get(mergeList.size() - 1)[1]);
            else mergeList.add(intervals[i]);
        }
        int[][] output = new int[mergeList.size()][2];
        for(int i = 0; i < mergeList.size(); i++){
            output[i] = mergeList.get(i);
        }
        return output;
    }
}