class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> avail = new HashMap<>();
        Map<Integer, Integer> vac = new HashMap<>();
        for(int i = 0; i < nums.length; i++) avail.put(nums[i], avail.getOrDefault(nums[i], 0) + 1);
        for(int num : nums){
            if(avail.get(num) <= 0) continue;
            else if(vac.getOrDefault(num, 0) > 0){
                avail.put(num, avail.getOrDefault(num, 0) - 1);
                vac.put(num, vac.get(num) - 1);
                vac.put(num + 1, vac.getOrDefault(num + 1, 0) + 1);
            }
            else if(avail.getOrDefault(num, 0) > 0 && avail.getOrDefault(num + 1, 0) > 0 && avail.getOrDefault(num + 2, 0) > 0){
                avail.put(num, avail.get(num) - 1);
                avail.put(num + 1, avail.get(num + 1) - 1);
                avail.put(num + 2, avail.get(num + 2) - 1);
                vac.put(num + 3, vac.getOrDefault(num + 3, 0) + 1);
            }
            else return false;
        }
        return true;
    }
}