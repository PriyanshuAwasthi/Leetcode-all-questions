class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> hm = new HashMap<>();
        Set<String> check = new HashSet<>();
        hm.put('a', ".-");
        hm.put('b', "-...");
        hm.put('c', "-.-.");
        hm.put('d', "-..");
        hm.put('e', ".");
        hm.put('f', "..-.");
        hm.put('g', "--.");
        hm.put('h', "....");
        hm.put('i', "..");
        hm.put('j', ".---");
        hm.put('k', "-.-");
        hm.put('l', ".-..");
        hm.put('m', "--");
        hm.put('n', "-.");
        hm.put('o', "---");
        hm.put('p', ".--.");
        hm.put('q', "--.-");
        hm.put('r', ".-.");
        hm.put('s', "...");
        hm.put('t', "-");
        hm.put('u', "..-");
        hm.put('v', "...-");
        hm.put('w', ".--");
        hm.put('x', "-..-");
        hm.put('y', "-.--");
        hm.put('z', "--..");
        for(int i = 0; i < words.length; i++){
            String str = words[i];
            String ans = "";
            for(int j = 0; j < str.length(); j++) ans += hm.get(str.charAt(j));
            check.add(ans);
        }
        return check.size();
    }
}