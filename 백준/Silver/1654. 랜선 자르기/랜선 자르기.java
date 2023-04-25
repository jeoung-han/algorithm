import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		int have = Integer.parseInt(num[0]);
		int need = Integer.parseInt(num[1]);
		int[] arr = new int[have];
		long max = 0;
		for (int i = 0; i < have; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = max > arr[i] ? max : arr[i];
		}
		
		max++;
		long min = 0;
		
		while(min < max) {
			long mid = (min + max) / 2;
			long count = 0;
			for (int i = 0; i < arr.length; i++) {
				count += (arr[i] / mid);
			}
			
			if(count < need) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
			
		}
		

		System.out.println(min - 1);

	}

}