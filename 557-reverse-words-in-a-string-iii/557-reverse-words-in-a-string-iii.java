// class Solution {
//     public String reverseWords(String s) {
//         String []temp = s.split(" ");
//         String ans = "";
//         for(String st : temp){
//             StringBuilder t = new StringBuilder(st);
//             ans += t.reverse().toString();
//             ans += " ";
//         }
//         return ans.trim();
//     }
// }
class Solution {
    public String reverseWords(String s) {
        char[]charArr = s.toCharArray();
        int leftIndex = 0;    
        int spaceIndex = 0;
        for(int i = 0; i < charArr.length; i++){
            if(i == charArr.length - 1 || charArr[i] == ' '){
                spaceIndex = (i == charArr.length - 1) ? i : i - 1;
                reverse(charArr, leftIndex, spaceIndex);
                leftIndex = i + 1;
            }
        }
        return new String(charArr);
    }
    private void reverse(char[] cArr, int l, int r){   
        while(l < r){            
            char c = cArr[l];
            cArr[l++] = cArr[r];
            cArr[r--] = c; 
        }        
    }
}