import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UseTest {
	public static void main(String[] args) throws IOException {		
		BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(read.readLine());
		
		int a= Integer.parseInt(token.nextToken());
		int b= Integer.parseInt(token.nextToken());		
		
		
		System.out.println(a + ":  "+b);
		
	}
}
