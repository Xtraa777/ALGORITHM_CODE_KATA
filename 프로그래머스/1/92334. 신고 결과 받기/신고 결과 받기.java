import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, Set<String>> map = new HashMap<>(); // <신고 ID, 신고한 ID>
        for (String str : report) {
            String[] strArr = str.split(" ");
            Set<String> set = map.getOrDefault(strArr[1], new HashSet<>());
            set.add(strArr[0]);
            map.put(strArr[1], set);
        }
        
        HashMap<String, Integer> reporterMap = new HashMap<>();
        for (Set<String> reporterSet : map.values()) {
            if (reporterSet.size() >= k) {
                for (String reporter : reporterSet) {
                    reporterMap.put(reporter, reporterMap.getOrDefault(reporter, 0) + 1);
                }
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reporterMap.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}