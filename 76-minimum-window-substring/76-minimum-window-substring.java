/*class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(char c : t.toCharArray()) hm1.put(c, hm1.getOrDefault(c, 0) + 1);
        int n = t.length();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i = 0; i < n; i++) hm2.put(s.charAt(i), hm2.getOrDefault(s.charAt(i), 0) + 1);
        String ans = "";
        if(hm1.equals(hm2)) ans = s.substring(0, n);
        int m = s.length();
        int j = n;
        for(int i = 1; j < m; ){
            hm2.put(s.charAt(i - 1), hm2.get(s.charAt(i - 1)) - 1);
            if(hm2.get(s.charAt(i)) <= 0) hm2.remove(s.charAt(i - 1));
            hm2.put(s.charAt(j), hm2.getOrDefault(s.charAt(j), 0) + 1);
            if(hm2.equals(hm1) && ans.length() > s.substring(i, j + 1).length()) ans = s.substring(i, j + 1);
            i++;
            j++;
        }
        return ans;
    }
}*/
class Solution {

public String minWindow(String s1, String s2) {
    HashMap<Character,Integer> map2 = new HashMap<>();
    int dct = s2.length();
    for(int i = 0; i<s2.length(); i++){
        char ch = s2.charAt(i);
        map2.put(ch,map2.getOrDefault(ch,0)+1);
    }
    HashMap<Character,Integer> map1 = new HashMap<>();
    int ct = 0;
    String ans = "";
    int i = -1;
    int j = -1;
    while(true){
        boolean f1 = false;
        boolean f2 = false;
        //acquire
        while(i<s1.length()-1 && ct<dct){
            i++;
            char ch = s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            
            //current count inc or not
            if(map1.getOrDefault(ch,0)<=map2.getOrDefault(ch,0)){
                ct++;
            }
            f1 = true;
        }
        //check shortest res and release
        while(j<i && ct==dct){
            String pans = s1.substring(j+1,i+1);
            if(ans.length()==0 || pans.length()<ans.length()){
                ans = pans;
            }
            j++;
            //release
            char ch = s1.charAt(j);
            if(map1.get(ch)==1){
                map1.remove(ch);
            }else{
                map1.put(ch,map1.get(ch)-1);
            }
            
            //counter check
            if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0)){
                ct--;
            }
            f2 = true;
        }
        if(f1==false && f2==false){
            break;
        }
    }
    return ans;
}
}