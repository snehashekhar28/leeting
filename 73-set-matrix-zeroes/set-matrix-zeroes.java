class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rowZ = new boolean[matrix.length];
        boolean[] colZ = new boolean[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rowZ[i] = true;
                    colZ[j] = true;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(rowZ[i] || colZ[j]) matrix[i][j] = 0;
            }
        }
    }
}