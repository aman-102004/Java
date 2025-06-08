package Dsa50days;

public class Duplicatesinarray {
    public static void duplicates(int [] arr){
        boolean found=false;


        for(int i=0 ;i< arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]){
                  System.out.println("Duplicate element is:"+arr[i]);
                  found=true;
                  return;

              }

          }


        }
        if(!found){
            System.out.println("No Duplicates found");
        }

    }

    public static void main(String[] args) {
        int [] arr={1,2,6,3,6,7};
        duplicates(arr);
    }
}
