class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        Set<Character> check = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(check.contains(s.charAt(i))) continue;
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            if(hm.get(s.charAt(i)) > 1){
                hm.remove(s.charAt(i));
                check.add(s.charAt(i));
            }
        }
        if(hm.isEmpty()) return -1;
        int i = 0;
        for( ; i < s.length(); i++) if(!check.contains(s.charAt(i))) break;
        return i;
    }
}