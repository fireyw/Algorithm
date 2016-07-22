//두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
package complete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2741 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(read.readLine());
		for(int i=1;i<=a; i ++)
		System.out.println(i);

	}
}
