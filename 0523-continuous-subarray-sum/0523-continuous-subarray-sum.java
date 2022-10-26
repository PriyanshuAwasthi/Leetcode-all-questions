class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     int sum = nums[i];
        //     for(int j = i + 1; j < n; j++){
        //         sum += nums[j];
        //         if(sum % k == 0) return true;
        //     }
        // }
        // return false;
        if(k == 0){
            boolean flag = false;
            for(int i = 1; i < nums.length; i++) if(nums[i] == 0 && nums[i - 1] == 0) flag = true;
            return flag;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(hm.containsKey(sum % k)) if(i - hm.get(sum % k) > 1) return true;
            hm.putIfAbsent(sum % k, i);
        }
        return false;
    }
}