import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++) {
			StringBuffer sb = new StringBuffer();
			for(int j = 0; j < num-1-i; j++) {
				sb.append(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				sb.append("*");
			}
			System.out.println(sb.toString());
		}
		for(int i = num-2; i >= 0; i--) {
			StringBuffer sb = new StringBuffer();
			for(int j = 0; j < num-1-i; j++) {
				sb.append(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				sb.append("*");
			}
			System.out.println(sb.toString());
		}
	}

}