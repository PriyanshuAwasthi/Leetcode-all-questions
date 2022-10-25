class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        for(String temp : word1) str1 += temp;
        String str2 = "";
        for(String temp : word2) str2 += temp;
        return str1.equals(str2);
    }
}