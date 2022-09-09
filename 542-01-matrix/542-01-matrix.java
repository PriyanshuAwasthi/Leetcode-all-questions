class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int v[][] = new int[n][m];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0){
                    v[i][j] = 0;
                    q.add(i * m + j);
                }
                else v[i][j] = -1; //not visited;
            }
        }
        int level = 0;
        int dir[][] = new int[][] {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
        while(!q.isEmpty()){
            int no = q.size();
            while(no-- > 0){
                int temp = q.poll();
                int row = temp / m;
                int col = temp % m;
                for(int i = 0; i < 4; i++){
                    int r = row + dir[i][0];
                    int c = col + dir[i][1];
                    if(r >= 0 && c >= 0 && r < n && c < m && v[r][c] == -1){
                        v[r][c] = level + 1;
                        q.add(r * m + c);
                    }
                }
            }
            level++;
        }
        return v;
    }
}