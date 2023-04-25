import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[31];
		arr[0] = 1;
		br.lines().mapToInt(Integer::parseInt).forEach(n -> {
			arr[n] = 1;
		});
		List<Integer> a = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(a.indexOf(0));
		System.out.println(a.lastIndexOf(0));
	}
}