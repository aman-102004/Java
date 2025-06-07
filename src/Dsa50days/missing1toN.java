package Dsa50days;

import java.sql.SQLOutput;

public class missing1toN {
    public static void miss(int [] arr){
        int n=arr.length+1;
        double totalsum=n*((double)(n+1)/2);

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        if(sum==totalsum){
            System.out.println("No element is missing in array");
        }
        else{
            System.out.println("Missing Element is:"+(totalsum-sum));
        }
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,8,9,10};
        miss(arr);
    }
}
