class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            int left = i + 1;
            int right = n - 1;
            int new_target = 0 - nums[i];
            
            while(left < right){
                if(nums[left] + nums[right] > new_target) --right;
                else if(nums[left] + nums[right] < new_target) ++left;
                else{
                    List<Integer> res2 = new ArrayList<Integer>();
                    
                    res2.add(nums[i]);
                    res2.add(nums[left]);
                    res2.add(nums[right]);
                    res.add(res2);
                    
                    while(left < right && nums[left] == res2.get(1)) ++left;
                    while(left < right && nums[right] == res2.get(2)) --right;
                }
            }
            while(i + 1 < n && nums[i] == nums[i + 1]) ++i;
        }
        return res;
    }
}