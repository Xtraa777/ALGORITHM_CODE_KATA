class Solution {
    public int[] solution(int n) {
        int index = 0;
        if (n % 2 == 0) {
            index = n / 2;
        } else {
            index = (n / 2) + 1;
        }
        
        int[] arr = new int[index];
        int num = 0;
        for (int i = 1; i <= n; i+=2) {
            arr[num] = i;
            num++;
        }
        
        return arr;
    }
}