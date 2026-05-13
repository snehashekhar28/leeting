class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        List<Integer> out = new ArrayList<>();
        int place = 0;
        while(top <= bottom && left <= right){
            place = left;
            while(left <= right){
                out.add(matrix[top][left]);
                left++;
            }
            left = place;
            place = ++top;
            while(top <= bottom){
                out.add(matrix[top][right]);
                top++;
            }
            top = place;
            right--;

            if(left <= right && top <= bottom){
                place = right;
                while(left <= right){
                    out.add(matrix[bottom][right]);
                    right--;
                }
                right = place;
                bottom--;

                place = bottom;
                while(top <= bottom){
                    out.add(matrix[bottom][left]);
                    bottom--;
                }
                bottom = place;
                left++;
            }

        }
        return out;
    }
}