class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        Map<Integer, Integer> map = new HashMap();
        int result = 0;
        
        for (int i = 0; i < time.length; i++) {
            int pair = (60 - time[i] % 60) % 60;
            result += map.getOrDefault(pair, 0);
            map.put(time[i] % 60, map.getOrDefault(time[i] % 60, 0) + 1);
        }
        
        return result;
        
    }
}