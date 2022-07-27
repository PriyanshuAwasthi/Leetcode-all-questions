class Solution {
    public int reverse(int x) {
        if(x == 0) return 0;
        int num = 0, temp = 0;
        while(x != 0){
            temp = x % 10;
            if(num > (Integer.MAX_VALUE / 10) || num < (Integer.MIN_VALUE / 10)) return 0;
            num = (num * 10) + temp;
            x /= 10;
        }
        return num;
    }
}
