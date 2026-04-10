class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Staircase search.

        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0; // Start with the first row.
        int col = n - 1; // Start with the last column.

        while (row < m && col >= 0) {
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }

        return false;
    }
}
