class Solution {
    public void setZeroes(int[][] matrix) {
        boolean lastRowZero = false;
        boolean lastColZero = false;
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[matrix.length-1][j] == 0) 
                lastRowZero = true;
        }
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][matrix[0].length-1] == 0) 
                lastColZero = true;
        }

        for(int i = 0; i < matrix.length - 1; i++){
            for(int j = 0; j < matrix[0].length - 1; j++){
                if(matrix[i][j] == 0){
                    matrix[i][matrix[0].length - 1] = 0;
                    matrix[matrix.length - 1][j] = 0;
                }
            }
        }

        for(int i = 0; i < matrix.length - 1; i++){
            for(int j = 0; j < matrix[0].length - 1; j++){
                if(matrix[i][matrix[0].length-1] == 0 || matrix[matrix.length-1][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(lastColZero){
            for(int i = 0; i < matrix.length; i++) 
                matrix[i][matrix[0].length-1] = 0;
        }
        if(lastRowZero){
            for(int j = 0; j < matrix[0].length; j++) 
                matrix[matrix.length-1][j] = 0;
        }
    }
}