class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //sort the array in ascending order according to the second column(i.e numberOfUnitsPerBox)
        /*Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1],b[1]));
        
        int ans = 0;
        for(int i=boxTypes.length-1;i>=0;i--){
            if(truckSize == 0) return ans;
            if(boxTypes[i][0] <= truckSize){
                ans += boxTypes[i][0]*boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else{
                ans += truckSize*boxTypes[i][1];
                truckSize = 0;
            }
        }
        return ans;*/
        Arrays.sort(boxTypes, (i, j) -> i[1] - j[1]);
        int ans = 0;
        for(int i = boxTypes.length - 1; i >= 0; i--){
            if(truckSize == 0) break;
            if(truckSize >= boxTypes[i][0]){
                ans += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else{
                ans += truckSize * boxTypes[i][1];
                truckSize = 0;
            }
        }
        return ans;
    }
}