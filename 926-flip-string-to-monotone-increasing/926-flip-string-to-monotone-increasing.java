class Solution {
    public int minFlipsMonoIncr(String s) {
        int one = 0;
        int zero_one = 0;
        int j = 0;
        while(s.charAt(j) == '0') j++;
        int i = j;
        for( ; i < s.length(); i++){
            if(s.charAt(i) == '1') one++;
            else zero_one++;
            if(zero_one > one) zero_one = one;
        }
        return zero_one;
    }
}