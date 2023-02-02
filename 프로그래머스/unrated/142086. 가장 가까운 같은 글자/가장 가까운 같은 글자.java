class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        char[] charArr = s.toCharArray();
        
        for(int i = 0; i < charArr.length; i++) {
        	int cha = charArr[i];
        	
        	boolean hasChar = false;
        	int count = 1;
        	for(int j = i-1; j >= 0; j--) {
        		if(charArr[j] == cha) {
        			hasChar = true;
        			break;
        		}
        		count++;
        	}
        	
        	answer[i] = (hasChar) ? count : -1;
        }
        
        
        return answer;
    }
}