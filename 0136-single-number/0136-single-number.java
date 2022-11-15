class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i : nums) ans ^= i;
        //a ^ a = 0
        //a ^ y = 1
        return ans;
    }
}