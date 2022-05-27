class Solution {
    int count = 0;
    public int numberOfSteps(int num) {
        reduce(num);
        return count;
    }
    
    private void reduce(int num){
        if(num == 0) return;
        if(num % 2 == 0){
            count++;
            reduce(num /= 2);
        }
        else{
            count++;
            reduce(num -= 1);
        }
    }
}