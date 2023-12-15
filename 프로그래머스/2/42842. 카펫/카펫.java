class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int w = 0; // width
        int h = 1; // height
        int total = yellow + brown; // 전체 개수
        
        for (; h <= yellow; h++) {
            if (yellow % h == 0) {
                w = yellow / h; // w * h = yellow
                if ((w + 2) * (h + 2) == total) {
                    break;
                }
            }
        }
        
        answer[0] = w + 2;
        answer[1] = h + 2;
        
        return answer;
    }
}