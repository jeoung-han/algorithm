import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static int count = 0;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	br.readLine();
    	Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(Main::getPrimeNumber);
    	System.out.println(count);
    }
    
    public static void getPrimeNumber(int num) {
    	if(num == 1) return;
    	if(num == 2) {
    		count++;
    		return;
    	};
    	
    	if (num % 2 == 0) return;

		for(int i=3; i<=Math.sqrt(num); i += 2){
			if(num % i == 0){ 
				return;
			} 
		}
		count++;
    }

}