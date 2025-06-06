package Dsa50days;

import java.util.Scanner;

public class sumpairs {
    public static void pairs(int [] arr){

        Scanner sc=new Scanner(System.in);

        int sum;
        System.out.print("Enter the Req Sum:");

        sum=sc.nextInt();
        int found=0;
        for(int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]==sum){
                    System.out.println("Pair Found "+arr[i]+","+arr[j]);
                    found++;
                }

            }
        }

        if(found==0){
            System.out.println("Pair not Available in given Array!!");
        }

    }

    public static void main(String[] args) {
        int [] arr={1,4,3,-2,-6,5,7};
        pairs(arr);

    }
}
