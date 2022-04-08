class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        if(n == 0 || n < 4) return res;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int left = j + 1;
                int right = n - 1;
                int new_target = target - (nums[i] + nums[j]);
                while(left < right){
                    int rem_sum = nums[left] + nums[right];
                    if(rem_sum > new_target) right--;
                    else if(rem_sum < new_target) left++;
                    else{
                        List<Integer> quad = new ArrayList<Integer>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);
                        
                        while(left < right && nums[left] == quad.get(2)) ++left;
                        
                        while(left < right && nums[right] == quad.get(3)) --right;
                    }
                }
                while(j + 1 < n && nums[j] == nums[j + 1]) ++j;
            }
            while(i + 1 < n && nums[i] == nums[i + 1]) ++i;
        }
        
        return res;
    }
}