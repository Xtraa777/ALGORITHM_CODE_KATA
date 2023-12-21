public class Solution {
    public int[] solution(int n, long left, long right) {
        int[] result = new int[(int) (right - left + 1)];

        long cursor = left;
        int i = 0;
        while(cursor <= right) {
            int rowNum = (int) ((cursor) / n);
            int colNum = (int) ((cursor) % n);

            if(colNum <= rowNum) result[i] = rowNum + 1;
            else result[i] = colNum + 1;

            cursor++;
            i++;
        }

        return result;
    }
}