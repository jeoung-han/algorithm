class Solution {

    public int solution(String s) {
    	int count = 0;
    	
    	while(s != null && s.length() != 0) {
    		s = split(s);
    		count++;
    	}
    	
    	return count;
    }
    
    private String split(String s) {
    	char[] arr = s.toCharArray();
		int firstChar = arr[0];
    	
    	int sameCount = 0;
    	int notSameCount = 0;
    	
    	for(int i = 0; i < arr.length; i++) {
    		int c = arr[i];
    		
    		if(firstChar == c) {
    			sameCount++;
    		}else {
    			notSameCount++;
    		}
    		
    		if(sameCount == notSameCount) {
    			String splitString = s.substring(i+1);
    			return splitString;
    		}
    	}
    	
    	return null;
    }
}