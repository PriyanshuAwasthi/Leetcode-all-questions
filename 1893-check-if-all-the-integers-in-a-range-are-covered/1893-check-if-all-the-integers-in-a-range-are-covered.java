class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int arr[] = new int[50];
        Arrays.fill(arr, 0);
        for(int i = 0; i < ranges.length; i++){
            for(int j = ranges[i][0] - 1; j <= ranges[i][1] - 1; j++){
                arr[j]++;
                arr[j]++;    
            }
        }
        for(int i = left - 1; i <= right - 1; i++) if(arr[i] == 0) return false;
        return true;
    }
}