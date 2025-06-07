package Dsa50days;

public class subarraywithgivensum {

    public static void subarray(int [] arr,int sum){
        int start=0;
        int currsum=0;
        for(int i=0;i< arr.length;i++){
            currsum+=arr[i];
            while(currsum>sum && start<=i){
                currsum-=arr[start];
                start++;
            }

            if(currsum==sum){
                System.out.println("The sum is Found between index "+start+" & "+i);
                return;
            }
            System.out.println("No subarray with the given sum found.");
        }




    }
    public static void main(String[] args) {
        int [] arr={1,4,6,2,5,9};
        int sum=12;
        subarray(arr,sum);
    }
}
