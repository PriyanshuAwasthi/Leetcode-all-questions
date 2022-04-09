class Solution {
public int longestConsecutive(int[] nums) {
int n = nums.length;
int count = 0;
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
for(int i = 0; i < n; i++){
if(!pq.contains(nums[i]) || pq.isEmpty()){
pq.add(nums[i]);
count++;
}
}
int res = 1;
int i = 0;
while(i <= count){
int a =  pq.poll();
int b = pq.peek();
if(a + 1 == b){
res = res + 1;
i += 2;
}
else{
i++;
}
}
return res;
}
}