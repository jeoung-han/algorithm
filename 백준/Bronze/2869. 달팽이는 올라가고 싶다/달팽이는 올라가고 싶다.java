import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int a = (z-y)/(x-y);
    	System.out.println((x-y)*a + y >= z ? a : a+1);
    }
}