class Solution {
    public void gameOfLife(int[][] board) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int n = board.length;
        int m = board[0].length;
        
        // System.out.println(n+" "+m);
        int []offset_x = {-1, -1, -1, 0, 1, 1, 1, 0};
        int []offset_y = {-1, 0, 1, 1, 1, 0, -1, -1};
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int sum = 0;
                for(int a = 0; a < 8; a++){
                    int nx = i+ offset_x[a];
                    int ny = j+ offset_y[a];
                    if(nx < n && nx >= 0 && ny < m && ny >= 0 && board[nx][ny]==1) 
                        sum ++; 
                }
                
                if(board[i][j] == 1 && sum < 2){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    temp.add(j);
                    res.add(temp);
                }
                // else if(board[i][j] == 1 && (sum == 2 || sum == 3)){
                //     continue;
                // }
                else if(board[i][j] == 1 && sum > 3){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    temp.add(j);
                    res.add(temp);
                }
                else if(board[i][j] == 0 && sum == 3){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    temp.add(j);
                    res.add(temp);
                }
            }
        }
        for(int i = 0; i < res.size(); i++){
            int x = res.get(i).get(0);
            int y = res.get(i).get(1);
            // System.out.println(x+" "+y);
            // board[x][y] = board[x][y];
            if(board[x][y] == 1) board[x][y] = 0;
            else if(board[x][y] == 0) board[x][y] = 1;
        }
    }
}