class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        // 중첩 for문으로 시도했지만 못풀겠음 -> 그러면 그냥 새로운 배열을 만들어서 count해주면?
        // 문제를... 잘... 읽자...
        int[] student = new int[n];
        
        for (int lost_std : lost) {
            student[lost_std - 1]--;
        }
        for (int reserve_std : reserve) {
            student[reserve_std - 1]++;
        }
        
        for (int i = 0; i < student.length; i++) {
            if (student[i] == -1) {
                if (i > 0 && student[i - 1] == 1) {
                    student[i - 1] = 0;
                    student[i] = 0;
                } else if (i < student.length -1 && student[i + 1] == 1) {
                    student[i + 1] = 0;
                    student[i] = 0;
                } else {
                    answer--;
                }
            }
        }
        
        return answer;
    }
}