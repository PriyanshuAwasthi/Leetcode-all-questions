class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int min_arr[] = new int[n];
        int i = 1;
        min_arr[0] = nums[0];
        while(i < n){
            if(nums[i] < min_arr[i - 1]) min_arr[i] = nums[i];
            else min_arr[i] = min_arr[i - 1];
            i++;
        }
        Stack<Integer> st = new Stack<>();
        int j = n - 1;
        while(j >= 0){
            while(!st.isEmpty() && st.peek() <= min_arr[j]) st.pop();
            if(!st.isEmpty() && st.peek() < nums[j]) return true;
            st.push(nums[j]);
            j--;
        }
        return false;
    }
}