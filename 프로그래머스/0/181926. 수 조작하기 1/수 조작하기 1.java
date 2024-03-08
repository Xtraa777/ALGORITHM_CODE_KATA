class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        char[] c = control.toCharArray();
        
        for (char cc : c) {
            switch (cc) {
                case 'w' -> n++;
                case 's' -> n--;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        
        return answer = n;
    }
}