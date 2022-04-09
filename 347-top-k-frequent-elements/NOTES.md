class Solution {
public int[] topKFrequent(int[] nums, int k) {
Map<Integer, Integer> freq = new HashMap<Integer>();
int n = nums.length;
for(int i = 0; i < n; i++){
freq.put(nums[i], getOrDefault(nums[i], 0) + 1);
}
int max = (Collections.max(map.values()));
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
for(Map.Entry()<Integer, Integer> itt : freq.entrySet()){
pq.add(itt.getValue());
}
int []ans = new int[k];
for(int i = 0; i < k; i++){
int a = pq.poll();
}
}
}