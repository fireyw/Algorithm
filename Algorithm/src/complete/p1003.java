
//https://www.acmicpc.net/problem/1003
//fibonacci 호출문제

package complete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1003 {
		static int one = 0;
		static int zero = 0;
		static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		int count=Integer.parseInt(reader.readLine());
		int val=0;
		arr=new int[count];
		for(int i=0;i<count;i++){
			arr[i]=Integer.parseInt(reader.readLine());
		}		
		
		for(int i=0;i<count;i++){			
			int temp=fin(arr[i]);
			System.out.println(zero+ " " + one);
			one=0;
			zero=0;			
		}
		
	}
	static public int fin(int n){
		if(n==0){
			zero++;
			return 0;
		}else if(n==1){
			one++;
			return 1;
		}else{
			return fin(n-1) + fin(n-2);
		}
		
	}
}
