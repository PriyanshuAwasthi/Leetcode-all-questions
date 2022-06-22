class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<Integer>((a, b) -> b - a);
        for(int i : nums) ans.add(i);
        for(int i = 1; i < k; i++) ans.poll();
        return ans.poll();
    }
}