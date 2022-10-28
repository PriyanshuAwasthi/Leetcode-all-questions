class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length == 0) return res;
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String temp : strs){
            char []t = temp.toCharArray();
            Arrays.sort(t);
            String tempo = String.valueOf(t);
            if(hm.containsKey(tempo)) hm.get(tempo).add(temp);
            else{
                hm.put(tempo, new ArrayList<String>());
                hm.get(tempo).add(temp);
            }
        }
        for(String te : hm.keySet()) res.add(hm.get(te));
        return res;
    }
}