import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] a = br.readLine().split(" ");
		int b = Integer.parseInt(br.readLine());
		long c = Arrays.stream(a).mapToInt(Integer::parseInt)
								.filter(n -> n == b)
								.count();
		System.out.println(c);
	}
}