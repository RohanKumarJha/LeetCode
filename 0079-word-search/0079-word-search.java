class Solution {
    public boolean find(char[][] board, String word, int start, int end, int idx) {
        if (idx == word.length()) return true;
        if (start < 0 || end < 0 || start >= board.length || end >= board[0].length) return false;
        if (board[start][end] != word.charAt(idx)) return false;

        char temp = board[start][end];
        board[start][end] = '$'; // mark as visited

        boolean found = find(board, word, start + 1, end, idx + 1) ||
                        find(board, word, start - 1, end, idx + 1) ||
                        find(board, word, start, end + 1, idx + 1) ||
                        find(board, word, start, end - 1, idx + 1);

        board[start][end] = temp; // restore original value
        return found;
    }

    public boolean exist(char[][] board, String word) {
        int row = board.length, col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (find(board, word, i, j, 0)) return true;
                }
            }
        }
        return false;
    }
}
