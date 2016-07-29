package uncomplete;
//https://www.acmicpc.net/problem/9465 문제참조
//현재 문제 푼 후 예외사항 발생하여 확인중
//예외사항 모두 살펴보았지만 160724까지 찾지못함
//예외사항 찾을 수 없음!!미해결 문제로 나둠
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p9465 {
	static int count=0;
	static int ret =0;
	static int arr[][];
	static int memo[][]=new int[2][100000];
	public static void main(String[] args) throws NumberFormatException, IOException{

	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	    //BufferedReader의 경우 엔터를 하나로 인식, 엔터가 있을 경우 token으로 쪼개줘야함
	    int t = Integer.parseInt(reader.readLine());
		
		int maxArr[] = new int[t];
		
		StringTokenizer token = new StringTokenizer("");
		
		for(int a=0; a<t; a++){
			count = Integer.parseInt(reader.readLine());
			arr= new int[2][count];
			
			for(int i=0;i<2;i++){  //메모이제이션 -1로 초기화
				for(int j=0;j<100000;j++){
					memo[i][j] = -1;
				}
			}
			
			for(int i=0;i<2;i++){
				token = new StringTokenizer(reader.readLine());
				for(int j=0;j<count;j++){
					arr[i][j]= Integer.parseInt(token.nextToken());
				}
			}
			maxArr[a]= Math.max(sol(0, 0), sol(1, 0));
		}
		
		for(int a=0; a<t; a++){
			System.out.println(maxArr[a]);
		}
	}
	
	static public int sol(int a, int b){
		if(b>=count)
			return 0;
		if(memo[a][b]!=-1){
			return memo[a][b];
		}
		else if(a==0){
			ret=Math.max(sol(1,b+1), sol(1, b+2))+arr[a][b];
		}else{
			ret=Math.max(sol(0,b+1), sol(1, b+2))+arr[a][b];
		}
		memo[a][b] = ret;
		return ret;
	}
}
