class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);    
        }
        
       
    
        
        Queue<Integer> maxheap = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));
        for(int key : freq.keySet()){ maxheap.add(key); }
        
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = maxheap.poll();
        }
        
        return ans;
    }
}