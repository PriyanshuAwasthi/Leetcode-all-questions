class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i < n; i++){
            for(int j = i; j < m; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = m - 1, a = 0; a <= j; j--, a++){
                int temp = matrix[i][a];
                matrix[i][a] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}