class Solution {
    public String solution(int[] food) {
        String answer = "";
        int num = 0;
            
        for(int i = 1; i < food.length; i++) {
            if(food[i] / 2 != 0) {
                num = food[i] / 2;
                
                for(int j = 1; j <= num; j++) {
                    answer += String.valueOf(i);
                }
            }
        }
        
        answer += "0";
        
        for(int i = answer.length() - 2; i >= 0; i--) {
            answer += String.valueOf(answer.charAt(i));
        }
        
        return answer;
    }
}