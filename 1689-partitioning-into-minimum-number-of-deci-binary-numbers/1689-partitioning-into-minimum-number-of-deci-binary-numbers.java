class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        char []ch = n.toCharArray();
        for(int i = 0; i < ch.length; i++){
            int temp = ch[i] - '0';
            if(ans < temp) ans = temp;
        }
        return ans;
    }
}