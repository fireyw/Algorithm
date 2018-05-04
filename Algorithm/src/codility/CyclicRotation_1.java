package codility;

import java.util.Arrays;

public class CyclicRotation_1 {
    public static void main(String[] args) {
       int[] A = {3, 8, 9, 7, 6};
       int result[]=new int[A.length];
       int K = 7 ;
       int move=0; //실질적으로 움직인 수
       if(K==A.length)
           result= A;
       else if(K>A.length)
            move= K%A.length ;
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
//        System.out.println("result : " + Arrays.toString(result));
    }
}
