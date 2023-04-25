import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = br.lines().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		int max = Collections.max(list);
		System.out.println(max);
		System.out.println(list.indexOf(max) + 1);
	}
}