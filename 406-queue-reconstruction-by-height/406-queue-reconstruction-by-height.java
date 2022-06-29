class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            else return a[0] - b[0];
        });
        
   
        
        int [][]ans = new int[people.length][people[0].length];
        for(int []row : ans) Arrays.fill(row, -1);
        
        for(int i = 0; i < people.length; i++){
            int count = people[i][1];
            for(int j = 0; j < people.length; j++){
                if(ans[j][0] == -1 && count == 0){
                    ans[j][0] = people[i][0];
                    ans[j][1] = people[i][1];
                    break;
                }
                else if(ans[j][0] == -1 || ans[j][0] >= people[i][0]){
                    count -= 1;
                }
            }
        }
        return ans;
    }
}