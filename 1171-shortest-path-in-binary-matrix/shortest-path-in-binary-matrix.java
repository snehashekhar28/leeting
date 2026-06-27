class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        if(grid[0][0] != 0) return -1;
        q.add(new int[]{0,0});
        grid[0][0] =1;
        int track = 1;
        while(!q.isEmpty()){
            int qSize = q.size();
            for(int i = 0; i < qSize; i++){
                int[] a = q.poll();
                if(a[0] == n - 1 && a[1] == n - 1) return track;
                if(a[0] + 1 < n && grid[a[0]+1][a[1]] == 0){
                    q.add(new int[]{a[0]+1,a[1]});
                    grid[a[0]+1][a[1]] = 1;
                }
                if(a[0] - 1 >= 0 && grid[a[0]-1][a[1]] == 0){
                    q.add(new int[]{a[0]-1,a[1]});
                    grid[a[0]-1][a[1]] = 1;
                }
                if(a[1] - 1 >= 0 && grid[a[0]][a[1]-1] == 0){
                    q.add(new int[]{a[0],a[1]-1});
                    grid[a[0]][a[1]-1] = 1;
                }
                if(a[1] + 1 < n && grid[a[0]][a[1]+ 1] == 0){
                    q.add(new int[]{a[0],a[1]+1});
                    grid[a[0]][a[1]+1] = 1;
                }
                if(a[1] + 1 < n && a[0] + 1 < n && grid[a[0]+1][a[1]+ 1] == 0){
                    q.add(new int[]{a[0]+1,a[1]+1});
                    grid[a[0]+1][a[1]+1] = 1;
                }
                if(a[1] + 1 < n && a[0] - 1 >= 0 && grid[a[0]-1][a[1]+ 1] == 0){
                    q.add(new int[]{a[0]-1,a[1]+1});
                    grid[a[0]-1][a[1]+1] = 1;
                }
                if(a[1] - 1 >= 0 && a[0] + 1 < n && grid[a[0]+1][a[1] - 1] == 0){
                    q.add(new int[]{a[0]+1,a[1]-1});
                    grid[a[0]+1][a[1]-1] = 1;
                }
                if(a[1] - 1 >= 0 && a[0] - 1 >= 0 && grid[a[0]-1][a[1] - 1] == 0){
                    q.add(new int[]{a[0]-1,a[1]-1});
                    grid[a[0]-1][a[1]-1] = 1;
                }
            }
            track++;
        }
        return -1;
    }
}