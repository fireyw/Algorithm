import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UseTest {    
	public static int arr[][];
	public static int memo[][]= new int[501][501];
	public static int count=0;
	public static int ret = 0;
	public static int tCount = 0;
	public static int xPos[]={1,-1,0, 0};
	public static int yPos[]={0, 0,1,-1};
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		count=Integer.parseInt(reader.readLine());
		
		arr= new int[501][501];
		
		StringTokenizer token ;
		
		for(int i=0; i<count; i++){
			token=new StringTokenizer(reader.readLine());
			for(int j=0; j<count;j++){
				arr[i][j]= Integer.parseInt(token.nextToken());
				memo[i][j]=1;
			}
		}
		int maxDay = 0;
		for(int i=0; i<count; i++){
			for(int j=0; j<count; j++){
				maxDay= Math.max(maxDay, sol(i,j));
			}			
		}
		System.out.println(maxDay);		
		
	}
	static int sol(int a, int b){
		if(memo[a][b]==1){
			for(int i=0 ;i<4;i++){
				int ny= a+yPos[i];  
				int nx= b+xPos[i];  

				if(ny<0||nx<0||ny>=count||nx>=count) continue;
				if(arr[a][b]>=arr[ny][nx]) continue;

				memo[a][b] = Math.max(memo[a][b], sol(ny, nx)+1);
			}
		}
		return memo[a][b];
	}

}
