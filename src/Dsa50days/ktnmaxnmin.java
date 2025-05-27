package Dsa50days;
import java.util.Scanner;
public class ktnmaxnmin {

    public static void main(String[] args) {
        int [] arr={2,6,3,9,5,1};

        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr.length-i-1;k++){
                if(arr[k]>arr[k+1]){
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }

        for(int k=0;k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }

        Scanner in=new Scanner(System.in);

        System.out.println("\nEnter the number of max and min element :");

        int num=in.nextInt();

        System.out.println("The " + num + " nd/rd/th Smallest Element is: " + arr[num - 1]);
        System.out.println("The " + num + " nd/rd/th Largest Element is: " + arr[arr.length - num]);








    }
}
