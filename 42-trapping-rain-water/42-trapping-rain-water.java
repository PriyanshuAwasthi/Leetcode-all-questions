class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int []left_max = new int[n];
        int []right_max = new int[n];
        
        for(int i = n - 1; i >= 0; i--){
            if(i == n - 1) right_max[i] = height[i];
            else if(height[i] > right_max[i + 1]) right_max[i] = height[i];
            else right_max[i] = right_max[i + 1];
        }
        
        for(int i = 0; i < n; i++){
            if(i == 0) left_max[i] = height[i];
            else if(height[i] > left_max[i - 1]) left_max[i] = height[i];
            else left_max[i] = left_max[i - 1];
        }
        
        int count = 0;
        for(int i = 1; i < n - 1; i++){
            count += Math.min(left_max[i], right_max[i]) - height[i];
        }
        
        return count;
    }
}