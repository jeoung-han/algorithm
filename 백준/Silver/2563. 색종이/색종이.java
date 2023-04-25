import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static int[][] arr = new int[100][100];
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	br.readLine();
    	br.lines().forEach(line -> {
    		String[] sArr = line.split(" ");
    		set(Integer.parseInt(sArr[0]), Integer.parseInt(sArr[1]));
    	});
    	
    	System.out.println(Arrays.stream(arr).mapToInt(n -> Arrays.stream(n).sum()).sum());
    }
    
    public static void set(int x, int y) {
    	for(int i = y; i < y + 10; i++) {
    		for(int j = x; j < x + 10; j++) {
    			if(arr[i][j] == 1) continue;
    			arr[i][j] = 1;
    		}
    	}
    }
}