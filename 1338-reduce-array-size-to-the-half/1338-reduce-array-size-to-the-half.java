class Solution {
    public int minSetSize(int[] arr) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++) hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        for(Map.Entry<Integer, Integer> temp : hm.entrySet()) q.add(temp.getValue());
        int n = arr.length;
        n /= 2;
        int count = 0;
        int i = 0;
        while(i < n){
            i += q.poll();
            count++;
            //q.poll();
        }
        return (count == 0) ? 1 : count;
    }
}