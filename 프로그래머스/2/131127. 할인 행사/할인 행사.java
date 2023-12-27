class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // want[i], number[i] : map(want[i], number[i])와 같다
        
        for (int i = 0; i < discount.length - 9; i++) { // 시작 날짜, 할인 품목
            int j = 0;
            for (; j < want.length; j++) { // want 품목
                int count = 0;
                for (int k = i; k <= i + 9; k++) {
                    if (want[j].equals(discount[k])) count++;
                }
                if (count != number[j]) break;
            }
            if (j == want.length) answer++;
        }
        
        return answer;
    }
}