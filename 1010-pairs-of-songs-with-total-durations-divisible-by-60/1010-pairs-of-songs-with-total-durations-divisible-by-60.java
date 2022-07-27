class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int pairs = 0;
        
        int[] remainders = new int[60];
        
        for (int i = 0; i < time.length; i++) {
            int t = time[i];
            int r = t % 60;
            int complement = r == 0 ? 0 : 60 - r;
            pairs += remainders[complement];
            remainders[r]++;
        }
        return pairs;
    }
}