class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int START=0, END=(matrix.length*matrix[0].length)-1;
        while(START <= END) {
            int MID = START+(END-START)/2;
            int ROW = MID/matrix[0].length;
            int COL = MID%matrix[0].length;
            if(matrix[ROW][COL] == target) return true;
            else if(matrix[ROW][COL] < target) {
                START = MID+1;
            } else {
                END = MID-1;
            }
        } return false;
    }
}