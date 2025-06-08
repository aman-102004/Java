package Dsa50days;

public class intersectionofsortedarrays {

    public static void intersection(int [] arr1,int [] arr2){

        int i=0,j=0;
        System.out.print("Intersection elements:");
        while(i<arr1.length&& j< arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            } else if (arr1[i]>arr2[j]) {
                j++;

            }
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }


    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] arr1={2,3,5,6,7};
        intersection(arr,arr1);
    }
}
