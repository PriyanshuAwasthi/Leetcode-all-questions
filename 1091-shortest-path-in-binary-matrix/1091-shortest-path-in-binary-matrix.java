class Solution {
    static class Node{
        int x;
        int y;
        int path;
        
        Node(int x, int y, int path){
            this.x = x;
            this.y = y;
            this.path = path;
        }
    }
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        Queue<Node> ans = new LinkedList<>();
        if(grid[0][0] == 1 || grid[n - 1][m - 1] == 1) return -1;
        
        ans.add(new Node(0, 0, 1));
        grid[0][0] = 1;
        
        int [][]direction = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
        
        while(!ans.isEmpty()){
            for(int i = 0; i < ans.size(); i++){
                Node pro = ans.poll();
                int X = pro.x;
                int Y = pro.y;
                int dist = pro.path;
                
                if(X == n - 1 && Y == m - 1) return dist;
                
                for(int []help : direction){
                    int x_offset = X + help[0];
                    int y_offset = Y + help[1];
                    
                    if(x_offset >= 0 && x_offset < n && y_offset < m && y_offset >= 0 && grid[x_offset][y_offset] == 0){
                        ans.add(new Node(x_offset, y_offset, dist + 1));
                        grid[x_offset][y_offset] = 1;
                    }
                }
            }
        }
        return -1;
    }
}