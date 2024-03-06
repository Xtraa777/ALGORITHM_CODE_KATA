class Solution {
    public String solution(String code) {
        String ret = "";
        char[] c_code = code.toCharArray();
        int mode = 0;
        
        for (int i = 0; i < c_code.length; i++) {
            if (c_code[i] == '1') {
                mode = mode == 0 ? 1 : 0;
            } else if (i % 2 == mode) {
                ret += c_code[i];
            }
        
        } 
        
        if (ret.equals("")) {
            return "EMPTY";
        } else {
            return ret;
        }
        
    }
}