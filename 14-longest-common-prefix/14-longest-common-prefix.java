class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length <= 1) return strs[0];
        int i = 0;
        int l = 1;
        int j = 0;
        while(j < strs[i].length() && j < strs[l].length()){
            if(strs[i].charAt(j) == strs[l].charAt(j)){
                res += strs[i].charAt(j);
                j++;
            }
            else break;
        }
        if(j == 0) return "";
        if(strs.length == 2) return res;
        for(int a = 2; a < strs.length; a++){
            if(strs[a].equals(res)) continue;
            int m = 0;
            while(m < strs[a].length() && m < res.length() && strs[a].charAt(m) == res.charAt(m)) m++;
            res = strs[a].substring(0, m);
        }
        return res;
    }
}