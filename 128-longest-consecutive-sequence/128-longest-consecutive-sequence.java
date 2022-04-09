class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> res = new HashSet<>();
        int n = nums.length;
        if(n == 0 || n == 1) return n;
        for(int i = 0; i < n; i++){
            res.add(nums[i]);
        }
        
        int longest = 0;
        
        for(int a : nums){
            if(!res.contains(a - 1)){
                int count = 1;
                int num_a = a;
                while(res.contains(num_a + 1)){
                    count++;
                    num_a += 1;
                }
                longest = (longest < count) ? count : longest;
            }
        }
        return longest;
    }
}