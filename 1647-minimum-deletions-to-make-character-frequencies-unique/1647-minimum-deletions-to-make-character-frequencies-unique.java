class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> ht = new HashMap();
        HashSet<Integer> hs = new HashSet();
        
        for(int i = 0; i < s.length(); i++){
            ht.put(s.charAt(i), ht.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        Iterator<Map.Entry<Character, Integer>> itr = ht.entrySet().iterator();
        int ans = 0;
        while(itr.hasNext()){
            Map.Entry<Character, Integer> entry = itr.next();
            int temp = entry.getValue();
            
            if(!hs.contains(temp)) hs.add(temp);
            else{
                while(hs.contains(temp) && temp > 0){
                    temp = temp - 1;
          
                    ans++;
                }
                if(temp > 0) hs.add(temp);
            }
        }
        
        return ans;
    }
}