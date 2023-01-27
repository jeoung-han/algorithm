import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
        	int n = score[i];
        	
        	if(i < k) {
            	list.add(n);
            	int min = Collections.min(list);
            	answer[i] = min;
            	continue;
        	}
        	
        	int min = Collections.min(list);
        	if(n < min) {
        		answer[i] = min;
        		continue;
        	}
        	
    		list.remove((Integer)min);
        	list.add(n);
        	int newMin = Collections.min(list);
        	answer[i] = newMin;
        }
        
        return answer;
    }
}