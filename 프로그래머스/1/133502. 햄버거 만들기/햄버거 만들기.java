import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> hamburger = new Stack<Integer>();
        
        for (int intIngredient : ingredient) {
            hamburger.push(intIngredient);
            if (hamburger.size() > 3) {
                if (hamburger.get(hamburger.size() - 4) == 1 &&
                    hamburger.get(hamburger.size() - 3) == 2 &&
                    hamburger.get(hamburger.size() - 2) == 3 &&
                    hamburger.get(hamburger.size() - 1) == 1) {
                    
                    hamburger.pop();
                    hamburger.pop();
                    hamburger.pop();
                    hamburger.pop();
                    
                    answer++;
                }
            }
        }
        return answer;
    }
}