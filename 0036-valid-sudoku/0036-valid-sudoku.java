class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (set.contains(ch)) return false;
                    set.add(ch);
                }
            }
        }

        // Check columns
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char ch = board[j][i];
                if (ch != '.') {
                    if (set.contains(ch)) return false;
                    set.add(ch);
                }
            }
        }

        // Check 3x3 subgrids
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                Set<Character> set = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        char ch = board[i][j];
                        if (ch != '.') {
                            if (set.contains(ch)) return false;
                            set.add(ch);
                        }
                    }
                }
            }
        }

        return true;
    }
}
