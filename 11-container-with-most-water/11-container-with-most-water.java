class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max1 = 0;
        while(i != j){
            int new_area = (Math.min(height[i], height[j])) * (j - i);
            max1 = (max1 <= new_area) ? new_area : max1;
            if(height[i] >= height[j]) j--;
            else i++;
        }
        return max1;
    }
}