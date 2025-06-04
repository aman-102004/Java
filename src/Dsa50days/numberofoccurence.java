package Dsa50days;

import java.util.Scanner;

public class numberofoccurence {

    public static void numberofocc(int [] arr) {
        int occcount=0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");

        int num=sc.nextInt();


        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                occcount++;
            }
        }

        System.out.println("Total Occurence of Element "+num + " is "+occcount);

    }
    public static void main(String[] args) {

        int [] arr={1,3,5,2,3,1,6,5,3};

        System.out.print("Array is:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        numberofocc(arr);

    }
}
