class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char alpha = s.charAt(i);

            if (alpha >= 'A' && alpha <= 'Z') {
                answer += (char)((alpha - 'A' + n) % 26 + 'A');
            } else if (alpha >= 'a' && alpha <= 'z') {
                answer += (char)((alpha - 'a' + n) % 26 + 'a');
            } else {
                answer += alpha;
            }
        }
        
        return answer;
    }
}