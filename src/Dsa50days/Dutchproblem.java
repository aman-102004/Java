package Dsa50days;

public class Dutchproblem {
//    public static void dutch(int[] arr) {
//        int k=0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                int temp=arr[i];
//                arr[i]=arr[k];
//                arr[k]=temp;
//                k++;
//
//
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==1){
//                int temp=arr[i];
//                arr[i]=arr[k];
//                arr[k]=temp;
//                k++;
//
//
//            }
//        }
//
//
//
//        for (int j=0;j<arr.length;j++){
//            System.out.print(arr[j]+" ");
//        }
//
//    }

    public static void dutch(int[] arr){
        int low=0,mid=0,high= arr.length-1;

        while(mid<=high){
            switch (arr[mid]){
                case 0:
                    int temp=arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    int temp2=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp2;
                    high--;
                    break;

            }
        }

        for(int num:arr){
            System.out.print(num+" ");

        }
    }

    public static void main(String[] args) {
        int [] arr={1,2,2,0,0,1};
        dutch(arr);

    }
}
