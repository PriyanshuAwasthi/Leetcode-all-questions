class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i, k = 0, l = 0;
        int m = matrix.length;
        int n = matrix[0].length;
 
        List<Integer> res = new ArrayList<Integer>();
 
        while (k < m && l < n) {
           
            for (i = l; i < n; ++i) {
                res.add(matrix[k][i]);
            }
            k++;
 
            for (i = k; i < m; ++i) {
                res.add(matrix[i][n - 1]);
            }
            n--;
 
            
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    res.add(matrix[m - 1][i]);
                }
                m--;
            }
 
            
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    res.add(matrix[i][l]);
                }
                l++;
            }
        }
        return res;
    }
}