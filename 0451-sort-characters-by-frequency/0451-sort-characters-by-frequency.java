class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()) hm.put(c, hm.getOrDefault(c, 0) + 1);
        for(Map.Entry<Character, Integer> itt : hm.entrySet()) pq.add(new Pair(itt.getKey(), itt.getValue()));
        StringBuilder sb = new StringBuilder("");
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            int count = temp.freq;
            char ch = temp.c;
            while(count-- > 0) sb.append(ch);
        }
        return sb.toString();
    }
    public class Pair{
        int freq;
        char c;
        public Pair(char c, int freq){
            this.freq = freq;
            this.c = c;
        }
    }
}