class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> temp1 = new LinkedList<>();
        Set<String> temp2 = new HashSet<>();
        for(String word : wordList) temp2.add(word);
        if(!temp2.contains(endWord)) return 0;
        temp1.add(beginWord);
        int level = 1;
        while(!temp1.isEmpty()){
            int s = temp1.size();
            for(int i = 0; i < s; i++){
                String curr = temp1.poll();
                char []arr = curr.toCharArray();
                for(int j = 0; j < arr.length; j++){
                    char org = arr[j];
                    for(char c = 'a'; c <= 'z'; c++){
                        if(arr[j] == c) continue;
                        arr[j] = c;
                        String temp3 = String.valueOf(arr);
                        if(temp3.equals(endWord)) return level + 1;
                        if(temp2.contains(temp3)){
                            temp1.add(temp3);
                            temp2.remove(temp3);
                        }
                    }
                    arr[j] = org;
                }
            }
            level++;
        }
        return 0;
    }
}