class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        if(intervals.length == 0) return ans.toArray(new int[0][]);
        Arrays.sort(intervals, (i, j) -> i[0] - j[0]);
        int st = intervals[0][0];
        int en = intervals[0][1];
        for(int i[] : intervals){
            if(i[0] <= en) en = Math.max(en, i[1]);
            else{
                ans.add(new int[]{st, en});
                st = i[0];
                en = i[1];
            }
        }
        ans.add(new int[]{st, en});
        return ans.toArray(new int[0][]);
    }
}