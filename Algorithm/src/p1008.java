//백준1008번 첫째 줄에 A/B를 소수점 9자리 이상 출력한다. 절대/상대 오차는 10-9 까지 허용한다.

import java.util.Scanner;

public class p1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a= s.nextInt();
		int b= s.nextInt();

		System.out.println(b-a);	
	}
}
