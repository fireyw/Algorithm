package complete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB_p1149 {
	public static int arr[][];
	public static int memo[][]= new int[1000][3];
	public static int count = 0;
	public static int ret=0;
	public static void main(String[] args) throws IOException {		
		BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
		int min = 0;
		count = Integer.parseInt(read.readLine());
		
		StringTokenizer token;
		arr = new int[count][3];
		for(int i=0; i<count; i++){
			token = new StringTokenizer(read.readLine());
			arr[i][0]=Integer.parseInt(token.nextToken());
			arr[i][1]=Integer.parseInt(token.nextToken());
			arr[i][2]=Integer.parseInt(token.nextToken());
		}
		for(int i=0; i<1000; i++){
			memo[i][0]= -1;
			memo[i][1]= -1;
			memo[i][2]= -1;
		}		
		min= Math.min(Math.min(sol(0, 0), sol(0, 1)), sol(0,2));
		System.out.println(min);
	}
	static int sol(int a, int b){		
		if(a>=count){			
			return 0;
		}
		if(memo[a][b]!=-1){			
			return memo[a][b];
		}
		if(b==0){
			ret= Math.min(sol(a+1, 1), sol(a+1, 2))+arr[a][b];
		}else if(b==1){
			ret= Math.min(sol(a+1, 0), sol(a+1, 2))+arr[a][b];
		}else if(b==2){
			ret= Math.min(sol(a+1, 0), sol(a+1, 1))+arr[a][b];
		}
		memo[a][b]=ret;
		
		return ret;		
	}
}
