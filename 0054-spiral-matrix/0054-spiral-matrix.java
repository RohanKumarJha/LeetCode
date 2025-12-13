class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length, col=matrix[0].length;
        int noOfElement = row*col;
        int count = 0;
        int rowStart=0, rowEnd=row-1;
        int colStart=0, colEnd=col-1;
        
        List<Integer> list = new ArrayList<>();
        while(count < noOfElement) {

            // 1st------------------------------------------------------
            int pointer = colStart;
            while(pointer <= colEnd) {
                list.add(matrix[rowStart][pointer++]);
                count++;
            } 
            rowStart++;
            if(count == noOfElement) return list;

            // 2nd------------------------------------------------------
            pointer = rowStart;
            while(pointer <= rowEnd) {
                list.add(matrix[pointer++][colEnd]);
                count++;
            } 
            colEnd--;
            if(count == noOfElement) return list;

            // 3rd------------------------------------------------------
            pointer = colEnd;
            while(pointer >= colStart) {
                list.add(matrix[rowEnd][pointer--]);
                count++;
            } 
            rowEnd--;
            if(count == noOfElement) return list;

            // 4th------------------------------------------------------
            pointer = rowEnd;
            while(pointer >= rowStart) {
                list.add(matrix[pointer--][colStart]);
                count++;
            } 
            colStart++;
            if(count == noOfElement) return list;
        } return list;
    }
}