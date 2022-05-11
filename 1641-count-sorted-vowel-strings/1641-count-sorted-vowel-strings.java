class Solution {
    int count = 0;
    public int countVowelStrings(int n) {
        char arr[] = new char[]{'a', 'e', 'i', 'o', 'u'};
        help(new ArrayList<>(), n, arr, 0);
        return count;
    }
    
    private void help(List<String> res, int n, char[] arr, int i){
        if(n == 0){
            count++;
            return;
        }
        for(int j = i; j < arr.length; j++){
            res.add(arr[j]+"");
            help(res, n - 1, arr, j);
            res.remove(res.size() - 1);
        }
    }
}