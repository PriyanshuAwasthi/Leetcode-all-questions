class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }
    
    public boolean helper(char [][]board){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){
                        if(check_valid(board, i, j, c)){
                            board[i][j] = c;
                            if(helper(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean check_valid(char [][]board, int row, int col, char c){
        for(int a = 0; a < 9; a++){
            if(board[a][col] == c) return false;
            if(board[row][a] == c) return false;
            if(board[3 * (row / 3) + a / 3][3 * (col / 3) + a % 3] == c) return false;
        }
        return true;
    }
}