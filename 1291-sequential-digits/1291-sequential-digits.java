class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        String t = "";
        t += 123456789;
        for(int i = 0; i < t.length(); i++){
            for(int j = i + 1; j < t.length(); j++){
                String te = t.substring(i, j + 1);
                int n = 0;
                if(!te.equals("")) n = Integer.parseInt(te);
                if(n >= low && n <= high) res.add(n);
            }
        }
        Collections.sort(res);
        return res;
    }
}