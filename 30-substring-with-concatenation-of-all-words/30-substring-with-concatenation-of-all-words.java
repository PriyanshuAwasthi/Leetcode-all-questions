import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : words)
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);

        int wordLength = words[0].length();
        int slidingWindowLength = words.length * wordLength;
        for (int windowStart = 0; windowStart <= s.length() - slidingWindowLength; windowStart++) {

            Map<String, Integer> wordSeenMap = new HashMap<>();
            for (int wordNum = 0; wordNum < words.length; wordNum++) {
                int wordStartIdx = windowStart + (wordNum * wordLength);
                int wordEndIdx = wordStartIdx + wordLength;
                String word = s.substring(wordStartIdx, wordEndIdx);

                wordSeenMap.put(word, wordSeenMap.getOrDefault(word, 0) + 1);

                if (!wordFrequencyMap.containsKey(word)) break;

                if (wordSeenMap.get(word) > wordFrequencyMap.get(word)) break;

                if (wordNum == words.length - 1) result.add(windowStart);
            }
        }
        return result;
    }
}