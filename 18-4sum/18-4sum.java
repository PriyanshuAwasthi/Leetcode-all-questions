class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int left = j + 1;
                int right = n - 1;
                int new_target = target - (nums[i] + nums[j]);
                
                while(left < right){
                    if(nums[left] + nums[right] > new_target) --right;
                    else if(nums[left] + nums[right] < new_target) ++left;
                    else{
                        List<Integer> res2 = new ArrayList<Integer>();
                        res2.add(nums[i]);
                        res2.add(nums[j]);
                        res2.add(nums[left]);
                        res2.add(nums[right]);
                        res.add(res2);
                    
                    
                        while(left < right && nums[left] == res2.get(2)) ++left;
                        while(left < right && nums[right] == res2.get(2)) --right;
                    }
                }
                
                while(j + 1 < n && nums[j] == nums[j + 1]) ++j;
            }
            while(i + 1 < n && nums[i] == nums[i + 1]) ++i;
        }
        return res;
    }
}