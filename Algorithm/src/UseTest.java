import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/1937
public class UseTest {    
	
	public static int arr[][];
	public static int day=0;
	public static int ret = 0;
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count=Integer.parseInt(reader.readLine());
		
		arr= new int[count][count];
		
		StringTokenizer token ;
		
		for(int i=0; i<count; i++){
			token=new StringTokenizer(reader.readLine());
			for(int j=0; j<count;j++){
				arr[i][j]= Integer.parseInt(token.nextToken());
			}
		}
		int min=Math.min(sol(0,0), sol(0,1));
	}
	static int sol(int a, int b){
		return arr[a][b];
	}

}
