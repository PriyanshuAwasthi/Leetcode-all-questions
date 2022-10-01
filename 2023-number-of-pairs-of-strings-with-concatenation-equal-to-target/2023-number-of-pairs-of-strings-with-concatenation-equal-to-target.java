class Solution {
    int count = 0;
    public int numOfPairs(String[] nums, String target) {
        int n = nums.length;  
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            ans.append(nums[i]);
            for(int j = 0; j < n; j++){
                if(i != j){
                    ans.append(nums[j]);
                    if(ans.toString().equals(target) == true) count++;
                    ans.delete(nums[i].length(), ans.length());
                }
            }
			ans.delete(0,  ans.length());
        }
        return count;
    }
}