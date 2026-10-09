class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        // Side 1 ke squares
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
        }

        // Side 2 se maximum possible side tak
        int maxSide = Math.min(m, n);

        for (int side = 2; side <= maxSide; side++) {
            for (int i = 0; i + side <= m; i++) {
                for (int j = 0; j + side <= n; j++) {
                    if (isValid(matrix, i, j, side)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public boolean isValid(int[][] matrix, int row, int col, int side) {
        for (int i = row; i < row + side; i++) {
            for (int j = col; j < col + side; j++) {
                if (matrix[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}