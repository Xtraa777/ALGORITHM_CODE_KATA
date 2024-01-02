import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String strNum = Integer.toString(n,k);
        String strArr[] = strNum.split("0");
        
        for(String s : strArr)
            if(!"".equals(s) && primeNum(Long.parseLong(s)) ) {
                answer++;
            }
        
        return answer;
    }
    
    public boolean primeNum(long a){
        if(a < 2) {
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0)
                return false;
        }
        
        return true;
    }
}