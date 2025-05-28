package Dsa50days;

public class postivennegative {
    public static void PN(int[] arr) {

        int num=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[num];
                arr[num]=temp;
                num++;



            }
        }

        for(int num1:arr){
            System.out.print(num1+" ");
        }

    }


    public static void main(String[] args) {
        int [] arr={1,2,-2,-1,-3,4};
        PN(arr);
    }
}

