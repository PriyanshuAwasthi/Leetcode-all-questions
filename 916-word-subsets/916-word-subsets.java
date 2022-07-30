class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>(); //Store the result.
        HashSet<String> set = new HashSet<>(); // To make a unique words2 String.
        
        for(String str: words2) set.add(str);
        
        int hash[] = new int[26]; //store count of words in words2.
        Arrays.fill(hash, 0);
        
        for(String str: set){
            int hash1[] = new int[26];
            Arrays.fill(hash1, 0);
            
            for(int i = 0; i < str.length(); i++)   hash1[str.charAt(i) - 97]++;
            
            for(int i = 0; i < 26; i++) hash[i] = Math.max(hash[i], hash1[i]);
        }
        
        for(int i = 0; i < words1.length; i++){
            int hash1[] = new int[26];
            Arrays.fill(hash1, 0);
            
            for(int j = 0; j < words1[i].length(); j++) hash1[words1[i].charAt(j) - 97]++;
            
            boolean flag = true;
            
            for(int j = 0; j < 26; j++){
                if(hash[j] > hash1[j]){
                    flag = false;
                    break;
                }
            }
            if(flag)    res.add(words1[i]);
        }
        return res;
    }
}