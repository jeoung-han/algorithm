import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int rength = Integer.parseInt(temp[0]);
		int[] intArr = new int[rength];
		br.lines().forEach(s -> {
			String[] arr = s.split(" ");
			int[] intArr2 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
			for(int i = intArr2[0] - 1; i < intArr2[1]; i++) {
				intArr[i] = intArr2[2];
			}
		});
		
		System.out.println(Arrays.toString(intArr).replaceAll("[^0-9\\s]", ""));
	}
}