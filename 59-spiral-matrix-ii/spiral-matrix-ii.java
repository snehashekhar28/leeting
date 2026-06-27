class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int[][] mat = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int right = n - 1;
        int left = 0;
        while(num <= n * n && top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                mat[top][i] = num++;
            }
            top++;
            for(int i = top; i<= bottom; i++){
                mat[i][right] = num++;
            }
            right--;
            for(int i = right; i >= left; i--){
                mat[bottom][i] = num++;
            }
            bottom--;
            for(int i = bottom; i >= top; i--){
                mat[i][left] = num++;
            }
            left++;
        }
        return mat;
    }
}