class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length/2; i++){
            for(int j = i; j < matrix[0].length - i - 1; j++){
                int ij1 = matrix[i][j];
                int ij2 = matrix[j][matrix.length - 1 - i];
                int ij3 = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = ij3;
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = ij2;
                matrix[j][matrix.length - 1 - i] = ij1;
            }
        }
    }
}
