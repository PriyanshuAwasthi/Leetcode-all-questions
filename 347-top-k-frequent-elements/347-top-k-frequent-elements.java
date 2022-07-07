class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> temp1 = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            temp1.put(nums[i], temp1.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> temp2 = new PriorityQueue<>((a, b) -> temp1.get(b) - temp1.get(a));
        for(int ki : temp1.keySet()) temp2.offer(ki);
        
        int ans[] = new int[k];
        
        for(int i = 0; i < k; i++){
            ans[i] = temp2.poll();
        }
        
        return ans;
    }
}