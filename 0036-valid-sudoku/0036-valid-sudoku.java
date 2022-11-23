class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++) for(int j = 0; j < board[0].length; j++) if(board[i][j] != '.') if(!helper(board, i, j)) return false;
        return true;
    }
    public boolean helper(char[][] b, int i, int j){
        for(int a = 0; a < 9; a++){
            if(b[a][j] != '.' && a != i && b[i][j] == b[a][j]) return false;
            if(b[i][a] != '.' && a != j && b[i][j] == b[i][a]) return false;
            if(i != (3 * (i / 3) + a / 3) && j != (3 * (j / 3) + a % 3) && b[3 * (i / 3) + a / 3][3 * (j / 3) + a % 3] == b[i][j]) return false;
        }
        return true;
    }
}