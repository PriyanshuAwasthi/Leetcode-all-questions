class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int start = 0;
        int end = n - k - 1;
        int new_sum = 0;
        for(int i = 0; i < n; i++){
            sum += cardPoints[i];
            if(end == i) new_sum = sum;
        }
        if(n == k) return sum;
        int ans = 0;
        while(end < n && end - start == n - k - 1){
            //ans = Math.max(ans, sum - new_sum);
            int temp = sum - new_sum;
            if(ans < temp) ans = temp; 
            new_sum -= cardPoints[start++];
            if(end + 1 < n)new_sum += cardPoints[++end];
        }
        return ans;
    }
}