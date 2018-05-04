package codility;

import java.util.Arrays;

public class CyclicRotation_1 {
    public static void main(String[] args) {
       int[] A = {};
       int result[]=new int[A.length];
       int K = 7 ;
       int move=0; //실질적으로 움직인 수
        int N=A.length;
       if(K==0)
           result=A;
       else if(N==0)
           result=A;
       else if(K>A.length)
            move= K%A.length;
       else
           move=K;
//        System.out.println("move : " + move);
        int temp=0;
        for(int i=0; i<A.length;i++){
            temp=A.length-move +i;
            if(temp>=A.length){
                temp=temp%A.length;
            }
            //System.out.println("i : " + i );
            result[i]=A[temp];
        }
        System.out.println("result : " + Arrays.toString(result));
      /*  int N = A.length;


        if (N==0)
            return A;
        if (K>=N)
            K %= N;
        if (K==0)
            return A;
        int [] rotA = new  int [N];
        for (int i=0; i<N; i++)
            rotA[i] = (i<K) ? A[N+i-K] : A[i-K];
        return rotA;
*/
    }
}
