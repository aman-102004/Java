package Dsa50days;

public class leaders {

    public static void leaders(int [] arr) {
        int max=arr[arr.length-1];
        System.out.println("Leader of this array is : "+ max);


        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.println("Leader of this array is : "+ max);
            }

        }

    }
    public static void main(String[] args) {
        int [] arr={4,1,3,8,7,6};
        leaders(arr);

    }
}
