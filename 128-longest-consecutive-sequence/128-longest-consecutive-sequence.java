class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> res = new HashSet<>();
        if(nums.length == 0 || nums.length == 1) return nums.length;
        for(int a : nums) res.add(a);
        
        int ans = 1;
        
        for(int i : nums){
            if(res.contains(i - 1)) continue;
            else{
                int curr_max = 1;
                int temp = i;
                while(res.contains(temp + 1)){
                    curr_max++;
                    temp++;
                }
                
                if(curr_max > ans) ans = curr_max;
            }
        }
        return ans;
    }
}