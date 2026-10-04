class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        //check if any 0 is there in first row and column or not
        boolean isRowZero = false;
        boolean isColZero = false;
        for (int j = 0; j < col; j++){
            if (matrix[0][j] == 0){
                isRowZero = true;
            }
        }
        for (int i = 0; i < row; i++){
            if (matrix[i][0] == 0){
                isColZero = true;
            }
        }

        //Start traversing in the matrix.
        //if and 0 encountered, set first element of its row and column 0
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //now start traversing from 1,1 index (leave first row and col)
        for (int i = 1; i < row; i++){
            for (int j = 1; j < col; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //now if any element is 0 in first row, make the entire row 0 and same for col
        if (isRowZero == true){
            for (int j = 0; j < col; j ++){
                matrix[0][j] = 0;
            }
        }
        if (isColZero == true){
            for (int i = 0; i < row; i++){
                matrix[i][0] = 0;
            }
        }
    }
}