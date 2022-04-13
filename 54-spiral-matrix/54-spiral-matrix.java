class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int down = n - 1;
        int left = 0;
        int right = m - 1;
       
        
        while(top <= down && left <= right){
            for(int i = left; i <= right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= down; i++){
               res.add(matrix[i][right]);                
            }
            right--;
            if(top <= down){
                for(int i = right; i >= left; i--){
                    res.add(matrix[down][i]);
                }
                down--;
            }
            if(left <= right){
                for(int i = down; i >= top; i--){
                        res.add(matrix[i][left]);
                }
                left++;
            }   
        }
        return res;
    }
}