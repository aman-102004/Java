package Dsa50days;

public class kadaneAlgorithm {
    public static int kadane(int [] arr){
        int maxending=arr[0];
        int maxsofar=arr[0];

        for(int i=1;i<arr.length;i++){
            maxending=Math.max(arr[i],maxending+arr[i]);
            maxsofar=Math.max(maxsofar,maxending);



        }

        return maxsofar;


    }
    public static void main(String[] args) {
        int [] arr ={2,-4,6,-3,-1,8};
        int max=kadane(arr);
        System.out.println("Max Contiguos Array sum is :"+ max);

    }
}
