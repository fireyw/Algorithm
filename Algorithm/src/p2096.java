import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//N줄에 0 이상 9 이하의 숫자가 세 개씩 적혀 있다. 내려가기 게임을 하고 있는데, 이 게임은 첫 줄에서 시작해서 마지막 줄에서 끝나게 되는 놀이이다.
//
//먼저 처음에 적혀 있는 세 개의 숫자 중에서 하나를 골라서 시작하게 된다. 그리고 다음 줄로 내려가는데, 다음 줄로 내려갈 때에는 다음과 같은 제약 조건이 있다.
//바로 아래의 수로 넘어가거나, 아니면 바로 아래의 수와 붙어 있는 수로만 이동할 수 있다는 것이다. 이 제약 조건을 그림으로 나타내어 보면 다음과 같다.
//https://www.acmicpc.net/problem/2096
//동적으로 할당해서 수를 계속 비교하는 방법으로 풀이
public class p2096 {
	static int arr[][];
	public static void main(String[] args) throws IOException{
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String input = reader.readLine();

	    int number = Integer.parseInt(input);
	    
	    arr = new int[number][3];

	    StringTokenizer token = new StringTokenizer("");
	    
	    
	    for(int i=0; i<number; i++){
	    	token=new StringTokenizer(reader.readLine());
	    	for(int j=0; j<3;j++){
	    		arr[i][j] = Integer.parseInt(token.nextToken());
	    	}
	    	System.out.println(i+ " 번째줄입력완료");
	    }
	    System.out.println("종료");
	    reader.close();
	}
}
