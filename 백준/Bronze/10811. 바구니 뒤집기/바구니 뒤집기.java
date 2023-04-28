import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine().split(" ")[0]);
		arr = new int[length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		br.lines().forEach(s->{
			String[] x = s.split(" ");
			int a = Integer.parseInt(x[0]);
			int b = Integer.parseInt(x[1]);
			switching(a, b);
		});
		
		System.out.println(Arrays.toString(arr).replaceAll("[^\\d\\s]", ""));
	}
	
	public static void switching(int a, int b) {
		for(int i = 0; i < (b-a+1)/2; i++) {
			int x = arr[a-1+i];
			arr[a-1+i] = arr[b-1-i];
			arr[b-1-i] = x;
		}
	}
}