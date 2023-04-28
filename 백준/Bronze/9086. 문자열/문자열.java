import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		br.lines().map(s -> {
			return s.charAt(0) +""+ s.charAt(s.length()-1);
		}).forEach(System.out::println);
	}
}