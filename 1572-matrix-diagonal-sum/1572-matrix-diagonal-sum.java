class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i=0; i<mat.length; i++){
            sum += mat[i][i];
        }

        int col = mat.length-1;
        int row = 0;

        while(row < mat.length){
            if (row==col){
                row++;
                col--;
            } else {
                sum += mat[row][col];
                row++;
                col--;
            }
            
        }

        return sum;
    }
}