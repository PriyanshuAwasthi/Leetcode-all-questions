class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n > 1 && n < 4) return false;
        long temp = 4;
        while(temp <= n){
            if(temp == n) return true;
            else{
                temp *= 4;
                if(temp >= Integer.MAX_VALUE) break;
            } 
        }
        
        //System.out.print(1162261466.getClass().getName());
        return false;
    }
}