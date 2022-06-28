class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
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
        return res;
    }
    
    public void helper(int col, char b[][], int l[], int l_d[], int u_d[], List<List<String>> res){
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
    }
}