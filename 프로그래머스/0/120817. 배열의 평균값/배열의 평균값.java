class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double num = 0;
        
        for(int i = 0; i < numbers.length; i++){
            num += numbers[i];
        }
        
        answer = num / numbers.length;
        
        return answer;
    }
}