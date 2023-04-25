import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.lines().forEach(s -> {
			String[] arr = s.split(" ");
			int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
			System.out.println(sum);
		});
	}
}