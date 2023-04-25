import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong() + sc.nextLong() + sc.nextLong();
		System.out.println(x);
	}
}