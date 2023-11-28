class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String str : babbling) {
            if (str.contains("ayaaya") || str.contains("yeye") || 
                str.contains("woowoo") || str.contains("mama")) {
                continue;
            }
            str = str.replaceAll("aya|ye|woo|ma", "");
            if (str.equals("")) {
                answer++;
            }

        }
        
        return answer;
    }
}