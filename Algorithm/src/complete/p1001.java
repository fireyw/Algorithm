//두 수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
package complete;
import java.util.Scanner;

public class p1001 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
		System.out.println((a+b)%c);
		System.out.println((a%c+b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c*b%c)%c);
	}

}
