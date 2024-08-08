class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int[][] newArr = new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                newArr[i][j] = image[i][col-j-1];
            }
        }
        // Reverse image
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(newArr[i][j] == 1) {
                    newArr[i][j] = 0;
                } else {
                    newArr[i][j] = 1;
                }
            }
        } return newArr;
    }
}