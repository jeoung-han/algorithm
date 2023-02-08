import java.util.stream.Collectors;

class Solution {
    public String solution(String s, String skip, int index) {

        return s.chars().mapToObj((c) -> {
        	
        	for(int i = 1; i <= index; i++) {
        		if(c=='z') {
        			c = 'a';
        		}else {
        			c++;
        		}
   
        		if(skip.indexOf((char) c) != -1) i--;
        	}
        	
        	return String.valueOf((char) c);
        }).collect(Collectors.joining());
    }
}