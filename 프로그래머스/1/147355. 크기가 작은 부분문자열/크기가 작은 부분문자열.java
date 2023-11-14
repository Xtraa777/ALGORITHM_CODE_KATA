class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();
        
        for(int i = 0; i <= tLength - pLength; i++) {
            String str = t.substring(i, i + pLength);
            //Integer strNum = Integer.valueOf(str);
            //Integer pNum = Integer.valueOf(p);
            long strNum = Long.parseLong(str);
            long pNum = Long.parseLong(p);
            
            if(strNum <= pNum) {
                answer++;
            }
        }
        
        return answer;
    }
}