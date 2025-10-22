class Solution {
    public boolean check(char[][] board, int row, int col, int index, String word) {
        if(index == word.length()) return true;
        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(index)) return false;
        char temp = board[row][col];
        board[row][col] = '$';
        boolean result = check(board,row+1,col,index+1,word) || check(board,row-1,col,index+1,word) 
        || check(board,row,col+1,index+1,word) || check(board,row,col-1,index+1,word);
        board[row][col] = temp;
        return result;
    }

    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean result = check(board,i,j,0,word);
                    if(result) return result;
                }
            }
        } return false;
    }
}