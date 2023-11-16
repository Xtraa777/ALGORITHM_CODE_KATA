import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int num = 0; num < commands.length; num++) {
            int i = commands[num][0];
            int j = commands[num][1];
            int k = commands[num][2];
            
            int[] arr = new int[j-i+1];
            int count = 0;
            
            for(int num2 = i - 1; num2 < j; num2++) {
                arr[count++] = array[num2];
            }    
        
            Arrays.sort(arr);
            answer[num] = arr[k - 1];
        
        }
        return answer;
    }
}