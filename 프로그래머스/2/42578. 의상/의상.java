import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        int count = 1;
        
        for (String str : map.keySet()) {
            count *= map.get(str) + 1;
        }
        
        answer = count - 1;
        
        return answer;
    }
}