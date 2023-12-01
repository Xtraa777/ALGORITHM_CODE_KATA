import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        char word;
        
        for (String str : keymap) {
            for (int i = 0; i < str.length(); i++) {
                word = str.charAt(i);
                if (map.containsKey(word)) {
                    if (map.get(word) < i + 1) { // 기존 key의 value < 신규 key의 value
                        continue; // 신규 key 무시
                    } else {
                        map.put(word, i + 1);
                    }
                } else {
                    map.put(word, i + 1);
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            String str = targets[i];
            int result = 0;
            for (int j = 0; j < str.length(); j++) {
                word = str.charAt(j);
                if (!map.containsKey(word)) {
                    result = -1;
                    break;
                } else {
                    result += map.get(word);
                }
            }
            answer[i] = result;
        }
        
        return answer;
    }
}