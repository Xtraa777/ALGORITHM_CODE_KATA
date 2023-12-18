import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int gyul : tangerine) {
            map.put(gyul, map.getOrDefault(gyul, 0) + 1);
        }
        
        int[] counts = new int[map.size()];
        int i = 0;
        for (int count : map.values()) {
            counts[i++] = count;
        }
        
        Arrays.sort(counts);
        int result = 1;
        int j = counts.length - 1;
        for (; j >= 0; j--) {
            if (k > counts[j]) {
                k -= counts[j];
                result++;
            } else {
                break;
            }
        }
        
        answer = result;
        
        return answer;
    }
}