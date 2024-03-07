class Solution {
    public int solution(int[] num_list) {
        int num1 = 1;
        int num2 = 0;
        
        for (int num : num_list) {
            num1 = num1 * num;
            num2 = num2 + num;
        }
        
        if (num1 < num2 * num2) {
            return 1;
        } else {
            return 0;
        }
        
    }
}