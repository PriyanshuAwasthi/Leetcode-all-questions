class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i =0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j] != '.') {
                    if(!isValid(board,i,j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] b, int i, int j) {
        if(isValidRow(b,i,j) && isValidCol(b,i,j) && isValidBox(b,i,j)) {
            return true;
        } 
        return false;
    }
    public boolean isValidRow(char[][] b, int i, int j) {
        for(int k = 0;k<9;k++){
            if(b[i][k] != '.' && k != j) {
                if(b[i][k]== b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidCol(char[][] b, int i, int j) {
        for(int k = 0;k<9;k++){
            if(b[k][j] != '.' && k != i) {
                if(b[k][j]== b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidBox(char[][] b, int i, int j) {
        int rowstart = i/3;
        rowstart = rowstart*3;
        int colstart = j/3;
        colstart = colstart*3;
        for(int row = rowstart;row<rowstart+3;row++){
            for(int col = colstart;col<colstart+3;col++)
            if(b[row][col] != '.' && row != i && col != j) {
                if(b[row][col]== b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}