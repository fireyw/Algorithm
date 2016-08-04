package complete;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다
public class p1924 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	    StringTokenizer token = new StringTokenizer("");
	    token=new StringTokenizer(reader.readLine());
	    int a=Integer.parseInt(token.nextToken());
	    int b=Integer.parseInt(token.nextToken());		
		
		int day=0;
		int arr[] =new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
		String weak[] = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};		
		
		for(int i=1;i<a;i++){
			day=day+arr[i];
		}
		day=day+b;
		System.out.println(weak[day%7]);
		
	}
}
