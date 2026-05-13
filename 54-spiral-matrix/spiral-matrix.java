class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> out = new ArrayList<>();
        int i = 0, j = 0;
        while(matrix[i][j] != -200){
            if(j + 1 < matrix[0].length && matrix[i][j+1] != -200){
                while(j + 1 < matrix[0].length && matrix[i][j+1] != -200){
                    out.add(matrix[i][j]);
                    matrix[i][j] = -200;
                    j++;
                }
            }
            else if (i + 1 < matrix.length && matrix[i+1][j] != -200){
                while (i + 1 < matrix.length && matrix[i+1][j] != -200){
                    out.add(matrix[i][j]);
                    matrix[i][j] = -200;
                    i++;
                }
            }
            else if(j - 1 >= 0 && matrix[i][j-1] != -200){
                while (j - 1 >= 0 && matrix[i][j-1] != -200){
                    out.add(matrix[i][j]);
                    matrix[i][j] = -200;
                    j--;
                }
            }
            else if(i - 1 >= 0 && matrix[i-1][j] != -200){
                while(i - 1 >= 0 && matrix[i-1][j] != -200){
                    out.add(matrix[i][j]);
                    matrix[i][j] = -200;
                    i--;
                }
            }
            else{
                break;
            }
        }
        out.add(matrix[i][j]);
        return out;
    }
}