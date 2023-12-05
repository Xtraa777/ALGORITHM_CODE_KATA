class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char c;
        
        for (int i = 0; i < s.length(); i++) {
	    		c = s.charAt(i);
	    		for (int j = 0; j < index; j++) {
	    			c++;
	    			if(c > 'z') {
                        c -= ('z' - 'a' + 1);
                    }
	    			if(skip.contains(String.valueOf(c))) {
                        j--;
                    }
	    		}
	    		answer += c;
	    	}
        
        return answer;
    }
}