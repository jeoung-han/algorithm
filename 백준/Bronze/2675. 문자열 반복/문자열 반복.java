import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		br.lines().forEach(s->{
			String[] x = s.split(" ");
			String temp = "";
			for(int i = 0; i < x[1].length(); i++) {
				for(int j = 0; j < Integer.parseInt(x[0]); j++) {
					temp += x[1].charAt(i);
				}
			}
			System.out.println(temp);
		});
	}
}