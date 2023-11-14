import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<String, Integer> numMap = new HashMap<>();
        numMap.put("zero", 0);
        numMap.put("one", 1);
        numMap.put("two", 2);
        numMap.put("three", 3);
        numMap.put("four", 4);
        numMap.put("five", 5);
        numMap.put("six", 6);
        numMap.put("seven", 7);
        numMap.put("eight", 8);
        numMap.put("nine", 9);
        
        String charNum = "";
        String strNum = "";
            
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                strNum += s.charAt(i);
            } else {
                charNum += s.charAt(i);
                if(numMap.containsKey(charNum)) {
                    strNum += Integer.toString(numMap.get(charNum));
                    charNum = "";
                }
            }
        }
        
        answer = Integer.parseInt(strNum);
        
        return answer;
    }
}