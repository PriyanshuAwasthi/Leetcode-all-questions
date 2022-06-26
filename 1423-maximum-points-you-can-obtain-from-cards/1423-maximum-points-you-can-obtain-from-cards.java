class Solution {
    //minimum subarray of length total_len - k
    public int maxScore(int[] cardPoints, int k) {
        int pick = cardPoints.length - k;
        
        int sum = 0;
        
        int i=0;
        for(i=0;i<pick;i++){
            sum += cardPoints[i];
        }
        
        int omax = sum;
        int idx = 0;
        while(i < cardPoints.length){
            sum -= cardPoints[idx];
            sum += cardPoints[i];
            idx++;
            i++;
            
            if(sum < omax){
                omax = sum;
            }
        }
        if(omax < 0) omax= 0;
        
        int totalsum = 0;
        for(int j=0;j<cardPoints.length;j++){
            totalsum += cardPoints[j];
        }
        
        return totalsum - omax;
    }
}