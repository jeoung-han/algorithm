import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> s = br.lines().mapToInt(n -> Integer.parseInt(n)%42).boxed().collect(Collectors.toSet());
		System.out.println(s.size());
	}
}