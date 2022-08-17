class Solution {
    public int maximumPopulation(int[][] logs) {
        int size = 2050 - 1950 + 1;
        int arr[] = new int[size];
        int max = 0;
        int ans = 0;
        Arrays.fill(arr, 0);
        for(int i = 0; i < logs.length; i++){
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }
        max = arr[0];
        ans = 0;
        for(int i = 1; i < arr.length; i++){
             arr[i] += arr[i - 1];
            if(max < arr[i]){
                max = arr[i];
                ans = i;
            }
        }
        return ans + 1950;
    }
}