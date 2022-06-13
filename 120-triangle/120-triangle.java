class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = 0;
        for(int i = 1; i < triangle.size(); i++){
            for(int j = 0; j <= i; j++){
                if(j == 0) min = triangle.get(i - 1).get(j) + triangle.get(i).get(j);
                else if(j == i) min = triangle.get(i).get(j) + triangle.get(i - 1).get(j - 1);
                else{
                    int a = triangle.get(i - 1).get(j);
                    int b = triangle.get(i - 1).get(j - 1);
                    if(a > b) min = triangle.get(i).get(j) + b;
                    else min = triangle.get(i).get(j) + a;
                }
                triangle.get(i).set(j, min);
            }
        }
        
        return Collections.min(triangle.get(triangle.size() - 1));
    }
}