class Solution {
    public boolean isPalindrome(int number) {
        int reverse =0;
        int num = number;
        if(num < 0) return false;
        while(number != 0){
            int rem = (number % 10);
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }
        int ans = Integer.compare(num, reverse);
        if(ans == 0) return true;
        else return false;    
    }
}
