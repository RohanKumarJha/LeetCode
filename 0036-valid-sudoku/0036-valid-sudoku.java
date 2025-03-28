class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check for the rows
        for(int i=0; i<board.length; i++) {
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=0; j<board[0].length; j++) {
                if(map.containsKey(board[j][i])) {
                    if(board[j][i] != '.') {
                        return false;
                    }
                } else {
                    map.put(board[j][i],1);
                }
            } 
        }

        // Check for the columns
        for(int i=0; i<board.length; i++) {
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=0; j<board[0].length; j++) {
                if(map.containsKey(board[i][j])) {
                   if(board[i][j] != '.') {
                        return false;
                    }
                } else {
                    map.put(board[i][j],1);
                }
            } 
        } 

        // Check for 3*3 grid
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Character> gridSet = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] != '.' && !gridSet.add(board[i][j])) {
                            return false;
                        }
                    }
                }
            }
        }
        
        return true;
    }
}