class Solution {
    class Pair{
        int i;
        int j;
        public Pair(int x, int y){
            i = x;
            j = y;
        }
    }
    int [][]dir;
    public int orangesRotting(int[][] grid) {
        dir = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++) for(int j = 0; j < m; j++) if(grid[i][j] == 2) q.add(new Pair(i, j));
        
        int count = 0;
        boolean f = false;
        while(!q.isEmpty()){
            f = true;
            count++;
            int sz=q.size();
            while(sz-->0){
             Pair p = q.poll();
            int r = p.i;
            int c = p.j;
            for(int i = 0; i < 4; i++){
                int row = r + dir[i][0];
                int col = c + dir[i][1];
                if(row >= 0 && col >= 0 && row < n && col < m && grid[row][col] == 1){
                    grid[row][col] = 2;
                    q.add(new Pair(row, col));
                } 
            }
            
            }
          
        }
        
        for(int temp[] : grid){
            for(int i : temp) if(i == 1) return -1;
        }
        if(f==false)return 0;
        return count - 1;
    }
}

/*class Solution {
    public int [][] dir=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public int orangesRotting(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        boolean flag=false;
        Queue<Integer> q= new LinkedList<>();
        for( int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)q.add(i*n+j);
            }
        
        int level=0;
        
        while(!q.isEmpty()){
            ++level;
            int sz=q.size();
            while(sz-->0){
                
                int curr=q.poll();
                
                int row=curr/n;
                int col=curr%n;
                for( int i=0;i<dir.length;i++){
                    int r=row+dir[i][0];
                    int c=col+dir[i][1];
                    
                    if(r>=0&&c>=0&&r<m&&c<n&&grid[r][c]==1){
                        q.add(r*n+c);
                        grid[r][c]=2;
                        flag=true;
                    }
                }
                 
            }
            
              
            
        }
        
       
         for( int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)return -1;
            }
         if(flag==false)return 0;
        
        return level-1;
        
    }
}*/