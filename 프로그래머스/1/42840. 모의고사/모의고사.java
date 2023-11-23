import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] index = new int[3];
       
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i%5]) {
                index[0]++;
            }
            if (answers[i] == supo2[i%8]) {
                index[1]++;
            }
            if (answers[i] == supo3[i%10]) {
                index[2]++;
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        
        int max = 0;
        
        for (int i = 0; i < 3; i++) {
            if (max < index[i]) {
               max = index[i]; 
            }
        }
        for (int i = 0; i < 3; i++) {
            if (max == index[i]) {
                answer.add(i + 1);
            }
        }
        
        return answer;
    }
}