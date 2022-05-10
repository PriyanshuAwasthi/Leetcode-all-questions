class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int lm = 0;
        int rm = 0;
        int total = 0;
        
        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] >= lm) lm = height[left];
                else total += lm - height[left];
                left++;
            }
            else if(height[right] <= height[left]){
                if(height[right] >= rm) rm = height[right];
                else total += rm - height[right];
                right--;
            }
        }
        return total;
    }
}