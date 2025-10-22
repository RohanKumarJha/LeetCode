class Solution {
    public boolean check(char[][] board, String word, int index, int pos1, int pos2) {
        if(index == word.length()) return true;
        if(pos1<0 || pos2<0 || pos1>=board.length || pos2>=board[0].length
        || board[pos1][pos2] != word.charAt(index)) return false;
        char temp = board[pos1][pos2];
        board[pos1][pos2] = '$';
        boolean result = check(board, word, index+1, pos1+1, pos2) 
        || check(board, word, index+1, pos1-1, pos2)
        || check(board, word, index+1, pos1, pos2+1)
        || check(board, word, index+1, pos1, pos2-1);
        board[pos1][pos2] = temp;
        return result;
    }

    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean result = check(board,word,0,i,j);
                    if(result) return result;
                }
            }
        } return false;
    }
}