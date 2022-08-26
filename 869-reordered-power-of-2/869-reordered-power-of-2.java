class Solution {
    public boolean reorderedPowerOf2(int n) {
        int arr[] = helper(n);
        int num = 1;
        for(int i = 0; i < 30; i++){
            if(Arrays.equals(arr, helper(num))) return true;
            num <<= 1;//double the number 
        } 
        return false;
    }
    public int[] helper(int n){
        int []temp = new int[10];
        while(n > 0){
            temp[n % 10]++;
            n /= 10;
        }
        return temp;
    }
}