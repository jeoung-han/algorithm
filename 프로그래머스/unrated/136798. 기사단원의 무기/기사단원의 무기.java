class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number ; i++){
        	int atk = countDivisors(i);
            answer += ( atk > limit) ? power : atk;
        }
        return answer;
    }
    private int countDivisors(int num) {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                count++;
                if(num/i!=i) count++;
            }
        }
        return count;
    }
}