class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int result = 0;
        
        for(int i = 1; i <= number; i++) {
            result = divisor(i);
            
            if(result <= limit) {
                answer += result;
            } else {
                answer += power;
            }
        }
        
        return answer;
    }
    
    public int divisor(int n) {
        int count = 0;
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i * i < n) {
                    count++;
                }
            }
        }
        
        return count;
    }
}