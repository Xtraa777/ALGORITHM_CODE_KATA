class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int count = 0;
        
        for(String str : arr) {
            if(str.contains(" ")) {
                count = 0;
            } else {
                count++;
            }
            
            if(count % 2 == 0) {
                answer += str.toLowerCase();
            } else {
                answer += str.toUpperCase();
            }
        }
        
        return answer;
    }
}