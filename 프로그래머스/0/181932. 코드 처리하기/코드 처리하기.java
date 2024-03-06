class Solution {
    public String solution(String code) {
        String ret = "";
        char[] c_code = code.toCharArray();
        int mode = 0;
        
        for (int i = 0; i < c_code.length; i++) {
            if (mode == 0) {
                if (c_code[i] != '1') {
                    if (i % 2 == 0) {
                        ret += String.valueOf(c_code[i]);
                    }
                }
                if (c_code[i] == '1') {
                    mode = 1;
                }
            } else {
                if (c_code[i] != '1') {
                    if (i % 2 != 0) {
                        ret += String.valueOf(c_code[i]);
                    }
                }
                if (c_code[i] == '1') {
                    mode = 0;
                }
            }
        }
        
        if (ret.equals("")) {
            ret = "EMPTY";
        }
        
        return ret;
    }
}