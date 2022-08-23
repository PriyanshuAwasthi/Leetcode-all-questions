class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int temp = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(temp > prices[i]) temp = prices[i];
            else ans = Math.max(prices[i] - temp, ans);
        }
        return ans;
    }
}