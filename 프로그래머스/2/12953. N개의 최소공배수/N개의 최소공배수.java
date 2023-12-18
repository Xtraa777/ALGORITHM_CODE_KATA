class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean check = true;
        
        while (check) {
            answer++;
            for (int i = 0; i < arr.length; i++) {
                if (answer % arr[i] != 0) {
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }
        }
        
        return answer;
    }
}