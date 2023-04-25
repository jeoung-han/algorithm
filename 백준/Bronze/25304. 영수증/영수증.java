import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long sum = Long.parseLong(br.readLine());
		br.readLine();
		
		String answer = br.lines().mapToInt(s -> {
			String[] temp = s.split(" ");
			return Integer.parseInt(temp[0])*Integer.parseInt(temp[1]);
		}).sum() == sum ? "Yes" : "No";
		
		System.out.println(answer);
	}
}