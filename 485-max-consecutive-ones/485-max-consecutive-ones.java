class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0, c = 0;
        for (int num : nums) {
            if (num == 1) {
                c++;
            } else {
                if (c >= i) {
                    i = c;
                }
                c = 0;
            }
        }
        return Math.max(c, i);
    }
}