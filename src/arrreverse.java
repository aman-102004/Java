public class arrreverse {
    public static void main(String[] args) {
        int [] arr={2,5,7,32,9,4};
        System.out.println("Original Array");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k] +" " );
        }
        for(int i=0;i<arr.length/2;i++){
            int temp1=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp1;



        }
        System.out.println("");
        System.out.println("Reversed Array");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k] +" " );
        }

    }
}
