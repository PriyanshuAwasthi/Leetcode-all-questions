class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingDouble(o -> o[0]));
        int start=points[0][0];
        int end=points[0][1];
        int count=1;
        for(int i=1;i<points.length;i++){
            if(end>=points[i][0]){
                start=Math.max(start,points[i][0]);
                end=Math.min(end,points[i][1]);
            }else{
                count++;
                start=points[i][0];
                end=points[i][1];
            }
        }
        return count;
    }
}