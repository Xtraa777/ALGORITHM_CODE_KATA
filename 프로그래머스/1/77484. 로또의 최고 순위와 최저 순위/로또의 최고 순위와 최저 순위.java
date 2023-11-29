class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        // 중첩 for문으로? [0의 개수 + 일치 개수], [그냥 일치 개수]
        int zero = 0;
        int equal = 0;
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    equal++;
                }
            }
        }
        
        int high_rank = 7 - (zero + equal);
        int low_rank = 7 - equal;
        
        if (high_rank > 5) {
            answer[0] = 6;
        } else {
            answer[0] = high_rank;
        }
        if (low_rank > 5) {
            answer[1] = 6;
        } else {
            answer[1] = low_rank;
        }
        
        return answer;
    }
}