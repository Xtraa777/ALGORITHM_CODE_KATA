class Solution {
    public long solution(int n) {
        long answer = 0;
        int[] arr = new int[n + 2];
        arr[0] = 0;
        arr[1] = 1;
        
        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }
        
        answer = arr[n + 1];
        
        return answer;
    }
}