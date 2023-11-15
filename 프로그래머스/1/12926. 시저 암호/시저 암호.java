class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
          switch (s.charAt(i)){
            case 'Z' : 
                answer += (char)(64 + n);
                continue;
            case 'z' :
                answer += (char)(96 + n);
                continue;
            case ' ' :
                answer += ' ';
                continue;
            default :
                answer += (char)(s.charAt(i) + n);
                break;
            }
        }
        return answer;
    }
}