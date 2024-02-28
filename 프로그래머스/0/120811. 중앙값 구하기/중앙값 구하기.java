class Solution {
    public int solution(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int checkNum = 0;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    checkNum++;
                }
            }
            if (checkNum == 0) {
                break;
            }
        }
        
        int answer = array[array.length / 2];
        return answer;
    }
}