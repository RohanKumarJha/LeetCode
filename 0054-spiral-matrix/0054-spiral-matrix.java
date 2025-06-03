class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int count=0;
        int minRow=0, maxRow=matrix.length-1;
        int minCol=0, maxCol=matrix[0].length-1;
        while(count < matrix.length*matrix[0].length) {

            int i=minCol;
            while(i <= maxCol) {
                list.add(matrix[minRow][i]);
                count++;
                i++;
            } minRow++;
            if(count == matrix.length*matrix[0].length) break;

            i = minRow;
            while(i <= maxRow) {
                list.add(matrix[i][maxCol]);
                count++;
                i++;
            } maxCol--;
            if(count == matrix.length*matrix[0].length) break;

            i = maxCol;
            while(i >= minCol) {
                list.add(matrix[maxRow][i]);
                count++;
                i--;
            } maxRow--;
            if(count == matrix.length*matrix[0].length) break;

            i = maxRow;
            while(i >= minRow) {
                list.add(matrix[i][minCol]);
                count++;
                i--;
            } minCol++;
            if(count == matrix.length*matrix[0].length) break;
        } return list;
    }
}