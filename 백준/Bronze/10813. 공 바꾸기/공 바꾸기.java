import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 1; i <= arr.length; i++) {
			arr[i-1] = i;
		}
		
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			int z = arr[x];
			arr[x] = arr[y];
			arr[y] = z;
		}
		
		System.out.println(Arrays.toString(arr).replaceAll("[^0-9\\s]", ""));
	}
}