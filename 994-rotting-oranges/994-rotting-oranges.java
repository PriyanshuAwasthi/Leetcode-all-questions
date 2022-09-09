class Solution {
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
}