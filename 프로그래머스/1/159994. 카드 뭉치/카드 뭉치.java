class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        String word;
        int index1 = 0, index2 = 0;
        
        for(int i = 0; i < goal.length; i++) {
            word = goal[i];
            if(index1 < cards1.length && word.equals(cards1[index1])) {
                index1++;
            } else if (index2 < cards2.length && word.equals(cards2[index2])) {
                index2++;
            } else {
                answer = "No";
                return answer;
            }
        }
        
        return answer;
    }
}