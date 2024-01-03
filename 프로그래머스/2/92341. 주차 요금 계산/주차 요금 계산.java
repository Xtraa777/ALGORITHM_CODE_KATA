import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> inTime = new HashMap<>(); // 입차 기록
        TreeMap<String, Integer> result = new TreeMap<>(); // 누적 주차 시간
        int time = 0;
        int hour = 0;
        int min = 0;
        
        for (String s : records) {
            String[] str = s.split(" "); // [0] 시각, [1] 차량 번호, [2] 내역
            
            String[] strTime = str[0].split(":"); // hour -> min 변환, [0] 시, [1] 분
            hour = Integer.parseInt(strTime[0]);
            min = Integer.parseInt(strTime[1]);
            time = hour * 60 + min;
            
            if (str[2].equals("IN")) {
                inTime.put(str[1], time);
                if (result.containsKey(str[1]) == false) {
                    result.put(str[1], 0);
                }
            }
            if (str[2].equals("OUT")) {
                // value : 누적 주차 시간 + (OUT 시각 - IN 시각)
                result.put(str[1], result.get(str[1]) + (time - inTime.get(str[1])));
                inTime.remove(str[1]);
                }
            }
        
        // 나가지 않은 차량
        for (Map.Entry<String, Integer> entry : inTime.entrySet()) {
            String carNum = entry.getKey();
            int inTimeValue = entry.getValue();
            result.put(carNum, result.get(carNum) + ((23 * 60 + 59) - inTimeValue));
        }
        
        int defTime = fees[0]; // 기본 시간
        int defFee = fees[1];  // 기본 요금
        int unitTime = fees[2]; // 단위 시간
        int unitFee = fees[3];  // 단위 요금
        
        int[] answer = new int[result.size()];
        
        int idx = 0;
        for (Integer parkingTime : result.values()) {
            int fee = defFee;
            // 기본 시간 초과 시 추가 요금 계산
            if (parkingTime > defTime) {
                int extraTime = parkingTime - defTime;
                fee += Math.ceil((double) extraTime / unitTime) * unitFee;
            }

            answer[idx++] = fee;
        }
        
        return answer;
    }
}