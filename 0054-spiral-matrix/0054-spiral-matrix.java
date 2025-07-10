class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return list;

        int row = matrix.length;
        int col = matrix[0].length;

        int rowStart = 0, rowEnd = row - 1;
        int colStart = 0, colEnd = col - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            // Traverse right
            for (int j = colStart; j <= colEnd; j++) {
                list.add(matrix[rowStart][j]);
            }
            rowStart++;

            // Traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            // Traverse left
            if (rowStart <= rowEnd) {
                for (int j = colEnd; j >= colStart; j--) {
                    list.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }

            // Traverse up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    list.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        return list;
    }
}
