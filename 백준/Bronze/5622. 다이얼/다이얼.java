import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static String[] arr= {"","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time = Arrays.stream(br.readLine().split("")).mapToInt(Main::indexOf).sum();
		System.out.println(time);
	}
	
	public static int indexOf(String s) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].contains(s)) return i+2;
		}
		return 0;
	}
}