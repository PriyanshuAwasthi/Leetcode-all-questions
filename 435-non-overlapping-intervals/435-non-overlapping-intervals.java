class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (i, j) -> (i[0] - j[0]) );
        int left = 0, right = 1, count = 0, n = intervals.length;
        while(right < n){
            if(intervals[left][1] <= intervals[right][0]){
                left = right;
                right++;
            }
            else if(intervals[left][1] <= intervals[right][1]){
                right++;
                count++;
            }
            else if(intervals[left][1] > intervals[right][1]){
                left = right;
                right++;
                count++;
            }
        }
        return count;
    }
}