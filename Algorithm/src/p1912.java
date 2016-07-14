
//n개의 정수로 이루어진 임의의 수열이 주어진다. dd
//우리는 이 중 연속된 몇 개의 숫자를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 
//단, 숫자는 한 개 이상 선택해야 한다.

//예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 
//여기서 정답은 12+21인 33이 정답이 된다.22
import java.util.Scanner;

public class p1912 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int count= s.nextInt();
		
		long max=0;
		long temp=0;
		long temp2=0;
		int[] a = new int[count];
		for(int i=0;i<count;i++){
			a[i]=s.nextInt();
		}
		max=a[0]; 
		for(int i =1; i<a.length; i++){
			if(a[i]<0){
				temp=0;
				if(max<a[i]){
					max=a[i];
				}else if(max+a[i]>0){
					temp2=max+a[i];
				}
			}else{
				temp=temp+a[i];
				if(max<temp){
					max=temp;
				}
			}
		}
	
		System.out.println(max);
	}
}
