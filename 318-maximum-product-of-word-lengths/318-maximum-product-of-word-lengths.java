class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int bit_rep[] = new int[n];
        
        for(int i = 0; i < n; i++){
            bit_rep[i] = set_bit(words[i]);
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((bit_rep[i] & bit_rep[j]) == 0){
                    int curr_max = words[i].length() * words[j].length();
                    max = (curr_max > max) ? curr_max : max;
                }
            }
        }
        return max;
    }
    
    private int set_bit(String str){
        int len = str.length();
        int bit = 0;
        for(char c : str.toCharArray()){
            int ind = c - 'a';
            bit |= 1 << ind;
        }
        return bit;
    }
}