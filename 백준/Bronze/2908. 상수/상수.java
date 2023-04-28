import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] x = br.readLine().split(" ");
        StringBuffer sb = new StringBuffer(x[0]);
        String x1 = sb.reverse().toString();
        sb = new StringBuffer(x[1]);
        String x2 = sb.reverse().toString();
		System.out.println(Integer.parseInt(x1) > Integer.parseInt(x2) ? x1 : x2);
	}
}