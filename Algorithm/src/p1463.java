//p1463번
//정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
//1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
//2. X가 2로 나누어 떨어지면, 2로 나눈다.
//3. 1을 뺀다.
//정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만드려고 한다. 
//연산을 사용하는 횟수의 최소값을 출력하시오.
//10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.

import java.util.Scanner;

public class p1463 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int n= s.nextInt();
		int count =0;
		while(n!=1){
			if(n%3==0){
				n=n/3;
				count++;
			}else if((n-1)%3==0){
				n=n-1;
				count++;
			}else if(n%2==0){
				n=n/2;
				count++;
			}else{
				n=n-1;
				count++;
			}
		}
		System.out.println(count);
		s.close();
	}
}
