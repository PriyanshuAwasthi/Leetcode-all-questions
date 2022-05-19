class Solution {
    int []x_offset = new int[]{0, -1, 0, 1};
    int []y_offset = new int[]{-1, 0, 1, 0};
    int rem[][];
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int distance_max = 0;
        rem = new int[n][m];
        for(int []temp : rem) Arrays.fill(temp, -1);
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int distance = find_path(matrix, m, n, i, j);
                if(distance > distance_max) distance_max = distance;
            }
        }
        
        return distance_max;
    }
    
    private int find_path(int matrix[][], int m, int n, int i, int j){
        if(rem[i][j] > 0) return rem[i][j];
        int max = 0;
        for(int a = 0; a < 4; a++){
            int x = i + x_offset[a];
            int y = j + y_offset[a];
            if(x >= 0 && y >= 0 && x < n && y < m && matrix[x][y] > matrix[i][j]){
                int path = find_path(matrix, m, n, x, y);
                if(max < path) max = path;
            }
        }
        rem[i][j] = max + 1;
        return max + 1;
        
    }
}