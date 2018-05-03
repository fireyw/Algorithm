package codility;

public class BinaryGap_1 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1041)); // 0
        String binary=Integer.toBinaryString(1041);
        int array1[]=new int[binary.length()];
        int j=0; //1이 있는 위치를 배열에 담는다
        int max=0;

        for(int i=0;i<binary.length(); i++){
            if(Character.toString(binary.charAt(i)).equals("1")){
                array1[j]=i;
                System.out.println(i);
                j++;
            }
        }

        int temp=0;

        if(j>1){
            for(int i=1;i<j;i++){
                temp=(array1[i]-array1[i-1])-1;
                if(temp>max)
                    max=temp;
            }
        }else{
            max=0;
        }
        System.out.println("max : " + max);
    }
}
