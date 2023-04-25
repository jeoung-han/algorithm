import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String answer = "";
		for(int i = 0; i < num/4; i++) {
			answer += "long ";
		}
		answer+= "int";
		System.out.println(answer);
	}
}