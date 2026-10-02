class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; //number of rows
        int n = matrix[0].length; //number of cols

        //find row using binary search approach
        int startRow = 0;
        int endRow = m-1;
        while (startRow <= endRow){
            int midRow = (startRow + endRow)/2;
            if (target >= matrix[midRow][0] && target <= matrix[midRow][n-1]){
                //row found
                int startCol = 0;
                int endCol = n-1;
                while (startCol <= endCol){
                    int midCol = (startCol + endCol)/2;
                    if (target == matrix[midRow][midCol]){
                        return true;
                    }
                    else if (target > matrix[midRow][midCol]){
                        startCol = midCol + 1;
                    }
                    else{
                        endCol = midCol -1;
                    }
                }
                return false;
            }
            else if (target < matrix[midRow][0]){
                endRow = midRow - 1;
            }
            else{
                startRow = midRow + 1;
            }
        }
        
    return false;   
    }
}