class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length-1;
        int n1 = matrix.length-1;
        int i = 0;
        //int j = 0;
        for(; i < n; i++){
            // System.out.println(i);
            // System.out.println(j);
            // System.out.println(n);
            // System.out.println();
            int j = i;
            for(; j < n; j++){
                int p0 = matrix[j][n1-i];
                int p1 = matrix[n1-i][n1-j];
                int p2 = matrix[n1-j][i];
                matrix[j][n1-i] = matrix[i][j];
                matrix[n1-i][n1-j] = p0;
                matrix[n1-j][i] = p1;
                matrix[i][j] = p2;
            }
            n--;
        }
    }
}