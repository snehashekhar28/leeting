class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) return mat;
        int[][] mat2 = new int[r][c];
        int i1 = 0;
        int j1 = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                mat2[i][j] = mat[i1][j1];
                if(j1 + 1 < mat[0].length) j1++;
                else if(i1 + 1 < mat.length){
                    i1++;
                    j1 = 0;
                }
            }
        }
        return mat2;
    }
}