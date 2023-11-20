class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int give = 0;
        int take = 0;
        
        while(n >= a) {
            take = (n / a) * b; // 돌려 받는 콜라 병의 수
            give = (take / b) * a; // 줘야 하는 콜라 병의 수
                
            n = n - give + take;
            
            answer += take;
        }
        
        return answer;
    }
}