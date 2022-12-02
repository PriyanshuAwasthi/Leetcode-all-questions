class Solution {
    public boolean closeStrings(String word1, String word2) {
        int ar1[] = new int[26];
        int ar2[] = new int[26];
        if(word1.length() != word2.length()) return false;
        // char wrd1[] = word1.toCharArray();
        // char wrd2[] = word2.toCharArray();
        for(char c : word1.toCharArray()) ar1[c - 'a']++;
        for(char c : word2.toCharArray()) ar2[c - 'a']++;
        for(int i = 0; i < 26; i++) if((ar1[i] == 0 && ar2[i] != 0) || ar1[i] != 0 && ar2[i] == 0) return false;
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        for(int i = 0; i < 26; i++){
            if(ar1[i] != 0 && ar2[i] != 0){
                m1.put(ar1[i], m1.getOrDefault(ar1[i], 0) + 1);
                m2.put(ar2[i], m2.getOrDefault(ar2[i], 0) + 1);
            }
        }
        return m1.equals(m2);
    }
}