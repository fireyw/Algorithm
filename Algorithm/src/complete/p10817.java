//https://www.acmicpc.net/problem/10817
//세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
//20 30 10 -->20
//40 40 40-->40
package complete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10817 {

	public static void main(String[] args) throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(read.readLine());
		
		int a= Integer.parseInt(token.nextToken());
		int b= Integer.parseInt(token.nextToken());
		int c= Integer.parseInt(token.nextToken());
		
		int sVal=0;
		
		sVal = a >= b ?  (c>=a? a: (b>=c?b:c)): (c>=b? b: (a>=c?a:c));
				
		System.out.println(sVal);
	}
}
