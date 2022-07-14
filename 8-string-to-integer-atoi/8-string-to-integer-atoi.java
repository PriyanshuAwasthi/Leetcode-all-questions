class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int start = 0;
        if(n == 0) return 0;
        while(start < n && s.charAt(start) == ' ') start++;
        if(start == n) return 0;
        boolean flag = false;
        if(s.charAt(start) == '-'){
            flag = true;
            start++;
        }
        else if(s.charAt(start) == '+') start++;
        long res = 0;
        for(int i = start; i < n; i++){
            if(Math.abs(res) >= Math.pow(2, 31)){
                if(!flag) res = 2147483647;
                else res = -2147483648;
            }
            if(s.charAt(i) < 48 || s.charAt(i) > 57) break;
            res = (res * 10) + Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        

        if(Math.abs(res) >= Math.pow(2, 31)){
            if(!flag) res = 2147483647;
            else res = -2147483648;
        }
        else res = (flag == true) ? 0 - res : res;
        return (int)res;
    }
}