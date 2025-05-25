public class maxnmin {

    public static void main(String[] args) {
        int [] arr={1,5,6,9,10};
        int min=arr[0];
        int max=arr[0] ;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Max Num is :"+max);
        System.out.println("Min Num is :"+min);
    }
}
