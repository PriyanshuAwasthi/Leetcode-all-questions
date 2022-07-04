class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        char [][]board = new char[n][n];
        int lower_dia[] = new int[2 * n - 1];
        int upper_dia[] = new int[2 * n - 1];
        int left[] = new int[n];
        for(char arr[] : board) Arrays.fill(arr, '.');
        
        helper(0, res, board, upper_dia, lower_dia, left);
        return res;
        /*List<List<String>> res = new ArrayList<List<String>>();
        char [][]b = new char[n][n];
        int l[] = new int[n];
        int l_d[] = new int[2 * n - 1];
        int u_d[] = new int[2 * n - 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                b[i][j] = '.';
            }
        }
        
        helper(0, b, l, l_d, u_d, res);
        return res;*/
    }
    
    public void helper(int col, List<List<String>> res, char board[][], int upper_dia[], int lower_dia[], int left[]){
        if(col == board.length){
            res.add(make(board));
            return;
        }
        
        for(int i = 0; i < board.length; i++){
            if(left[i] == 0 && lower_dia[col + i] == 0 && upper_dia[board.length - 1 + col - i] == 0){
                board[i][col] = 'Q';
                left[i] = 1;
                lower_dia[col + i] = 1;
                upper_dia[board.length - 1 + col - i] = 1;
                helper(col + 1, res, board, upper_dia, lower_dia, left);
                board[i][col] = '.';
                left[i] = 0;
                lower_dia[col + i] = 0;
                upper_dia[board.length - 1 + col - i] = 0;
            }
        }
    }
    
    public List<String> make(char board[][]){
        List<String> res2 = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String temp = new String(board[i]);
            res2.add(temp);
        }
        return res2;
    }
    
    /*public void helper(int col, char b[][], int l[], int l_d[], int u_d[], List<List<String>> res){
        if(col == b.length){
            res.add(make(b));
            return;
        }
        
        for(int i = 0; i < b.length; i++){
            if(l[i] == 0 && l_d[col + i] == 0 && u_d[b.length - 1 + col - i] == 0){
                l[i] = 1;
                l_d[col + i] = 1;
                u_d[b.length - 1 + col - i] = 1;
                b[i][col] = 'Q';
                helper(col + 1, b, l, l_d, u_d, res);
                l[i] = 0;
                l_d[col + i] = 0;
                u_d[b.length - 1 + col - i] = 0;
                b[i][col] = '.';
            }
        }
    }
    
    public List<String> make(char b[][]){
        List<String> res2 = new ArrayList<>();
        for(int i = 0; i < b.length; i++){
            String temp = new String(b[i]);
            res2.add(temp);
        }
        return res2;
    }*/
}