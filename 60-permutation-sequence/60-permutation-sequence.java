class Solution {
    public String getPermutation(int n, int k) {
        int factorial = 1;
        List<Integer> temp = new ArrayList<>();
        for(int i = 1; i < n; i++){
            factorial *= i;
            temp.add(i);
        }
        temp.add(n);
        String ans = "";
        k -= 1;
        while(true){
            ans += temp.get(k / factorial);
            temp.remove(k / factorial);
            if(temp.size() == 0) break;
            k = k % factorial;
            factorial /= temp.size();
        }
        return ans;
    }
}