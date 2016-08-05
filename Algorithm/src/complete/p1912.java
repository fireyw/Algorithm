
//n개의 정수로 이루어진 임의의 수열이 주어진다. 
//우리는 이 중 연속된 몇 개의 숫자를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 
//단, 숫자는 한 개 이상 선택해야 한다.

//예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 
//여기서 정답은 12+21인 33이 정답이 된다.
//-->풀이완료 고려해야할 사항
//1. 전체수의 합이 0 보다 작을때 다음수가 양수가 오면 무조건 양수로 바꿔준다
//2. 전체수의 합이 음수인데 또 음수가 올 경우 그전 값을 초기화하고 해당 음수로 바꿔준다
//문제풀기전 꼭 경우의 수 생각하기
package complete;
import java.util.Scanner;

public class p1912 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int count= s.nextInt();
		
		long max=0;
		long temp=0;
	
		int[] a = new int[count];
		for(int i=0;i<count;i++){
			a[i]=s.nextInt();
		}
		max=a[0];
		temp=a[0];
		for(int i =1; i<a.length; i++){
			if(a[i]<0){
				if(temp+a[i]>0){
					temp=temp+a[i];
				}else{
					temp=a[i];
				}
			}else{
				if(temp<0){
					temp=a[i];
				}else{
					temp=temp+a[i];
				}
			}
	
			if(max<temp){
				max=temp;
			}else if(temp<0){
				temp=0; //임시변수 초기화
			}						
		}
	
		System.out.println(max);
	}
}
