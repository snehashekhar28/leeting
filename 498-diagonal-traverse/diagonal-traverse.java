class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int im = 0;
        int[] diag = new int[rows * cols];
        int i = 0;
        int j = 0;
        while(im < rows * cols){
            diag[im] = mat[i][j];
            System.out.println(diag[im]);
            im++;
            //going up diagonally
            if(i - 1 >= 0 && j + 1 < mat[0].length){
                while(i - 1 >= 0 && j + 1 < mat[0].length){
                    diag[im] = mat[--i][++j];
                    System.out.println(diag[im]);
                    im++;
                }
                if(j + 1 >= mat[0].length) i++; else j++;
            }
            //going down diagonally
            else if (i + 1 < mat.length && j - 1 >= 0){
                while(i + 1 < mat.length && j - 1 >= 0){
                    diag[im] = mat[++i][--j];
                    System.out.println(diag[im]);
                    im++;
                }
                if(i + 1 >= mat.length) j++; else i++;
            }
            else{
                if(j + 1 >= mat[0].length){
                    i++;
                } else j++;
            }
        }
        return diag;
    }
}