class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = p.length();
        int m = s.length();
        if(n > m) return new ArrayList<>();
        HashMap<Character, Integer> h1 = new HashMap<>();
        for(int i = 0; i < n; i++) h1.put(p.charAt(i), h1.getOrDefault(p.charAt(i), 0) + 1);

        HashMap<Character, Integer> h2 = new HashMap<>();
        for(int i = 0; i < n; i++) h2.put(s.charAt(i), h2.getOrDefault(s.charAt(i), 0) + 1);
        int count = 0;
        List<Integer> ans = new ArrayList<>();
        if(h1.equals(h2)) ans.add(0);
        for(int i = 1, j = n; j < m;){
            h2.put(s.charAt(i - 1), h2.get(s.charAt(i - 1)) - 1);
            if(h2.get(s.charAt(i - 1)) <= 0) h2.remove(s.charAt(i - 1));
            h2.put(s.charAt(j), h2.getOrDefault(s.charAt(j), 0) + 1);
            if(h1.equals(h2)) ans.add(i);
            i++;
            j++;
        }
        return ans;
    }
}