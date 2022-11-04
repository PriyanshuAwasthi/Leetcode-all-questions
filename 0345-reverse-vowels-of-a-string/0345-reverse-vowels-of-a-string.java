class Solution {
    public String reverseVowels(String s) {
        HashMap<Integer, Character> hm = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||  s.charAt(i) == 'i' ||  s.charAt(i) == 'o' ||  s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' ||  s.charAt(i) == 'I' ||  s.charAt(i) == 'O' ||  s.charAt(i) == 'U'){
            hm.put(i, s.charAt(i));
            ls.add(i);
        }
        Collections.sort(ls);
        char c[] = s.toCharArray();
        int i = 0;
        int j = ls.size() - 1;
        // System.out.print(j);
        while(i < j){
            int a = ls.get(i++);
            int b = ls.get(j--);
            char temp = c[a];
            c[a] = hm.get(b);
            c[b] = temp;
        }
        return new String(c);
    }
}