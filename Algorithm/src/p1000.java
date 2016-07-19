//두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1000 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		/*Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		int b= s.nextInt();*/
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(read.readLine());
		
		int a= Integer.parseInt(token.nextToken());
		int b= Integer.parseInt(token.nextToken());
		
		System.out.println(a+b);	
	}
}
