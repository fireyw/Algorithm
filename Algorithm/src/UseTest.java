import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/1937
//4
//14 9 12 10
//1 11 5 4
//7 15 2 13
//6 3 16 8
public class UseTest {    
	public static int arr[][];
	public static int count=0;
	public static int ret = 0;
	public static int tCount = 0;
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		count=Integer.parseInt(reader.readLine());
		
		arr= new int[501][501];
		
		StringTokenizer token ;
		
		for(int i=0; i<count; i++){
			token=new StringTokenizer(reader.readLine());
			for(int j=0; j<count;j++){
				arr[i][j]= Integer.parseInt(token.nextToken());
			}
		}
		int maxDay=sol(3,1);
		System.out.println(ret);
	}
	static int sol(int a, int b){
		System.out.println("arr[a][b] : "+ arr[a][b] + " , a : "+a+ " ,b : " +b );
		if((a<0)||(b<0)){
			System.out.println("배열값 0보다 작음");
			return 0;
		}else if((a>=count)||(b>=count)){
			System.out.println("배열값 count보다 큼");
			return 0;
		}
		if(arr[a+1][b]>arr[a][b]){
			System.out.println("호출1");
			tCount++;
			ret=Math.max(ret, tCount);
			sol(a+1, b);
		}
		else if(arr[a-1][b]>arr[a][b]){
			System.out.println("호출2");
			tCount++;
			ret=Math.max(ret, tCount);
			sol(a-1, b);
		}
		else if(arr[a][b+1]>arr[a][b]){
			System.out.println("호출3");
			tCount++;
			ret=Math.max(ret, tCount);
			sol(a, b+1);
		}
		else if(arr[a][b-1]>arr[a][b]){
			System.out.println("호출4");
			tCount++;
			ret=Math.max(ret, tCount);
			sol(a, b-1);
		}else{
			System.out.println("호출5");
			tCount=0;
			return 0;
		}
		//ret= Math.max(sol(a+1, b), sol(a, b+1));
		System.out.println("함수 마지막 return 전");
		return 0;
	}

}
