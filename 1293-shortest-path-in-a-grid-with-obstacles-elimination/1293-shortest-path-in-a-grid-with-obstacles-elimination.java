class Solution {
    class Tuple{
        int row;
        int col;
        int max;
        public Tuple(int i, int j, int k){
            row = i;
            col = j;
            max = k;
        }
    }
    public int shortestPath(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        if(n == 1 && m == 1) return 0;
        Queue<Tuple> q = new LinkedList<>();
        int maxSoFar[][] = new int[n][m];
        for(int a[] : maxSoFar) Arrays.fill(a, -1);
        q.add(new Tuple(0, 0, k));
        maxSoFar[0][0] = k;
        int level = 0;
        int dir[][] = new int[][]{{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
        while(!q.isEmpty()){
            int len = q.size();
            while(len-- > 0){
                Tuple temp = q.poll();
                int r = temp.row;
                int c = temp.col;
                int curr = temp.max;
                for(int i = 0; i < 4; i++){
                    int rr = r + dir[i][0];
                    int cc = c + dir[i][1];
                    if(rr == n - 1 && cc == m - 1) return level + 1;
                    if(rr >= 0 && cc >= 0 && rr < n && cc < m){
                        if(grid[rr][cc] == 1 && curr > 0 && maxSoFar[rr][cc] < curr - 1){
                            q.add(new Tuple(rr, cc, curr - 1));
                            maxSoFar[rr][cc] = curr - 1;
                        }
                        else if(grid[rr][cc] == 0 && maxSoFar[rr][cc] < curr){
                            q.add(new Tuple(rr, cc, curr));
                            maxSoFar[rr][cc] = curr;
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }
}