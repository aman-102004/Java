package Dsa50days;

public class unionintersection {

    public static void union(int [] arr1,int [] arr2) {
        int l1=arr1.length;
        int l2=arr2.length;


        int [] arr=new int[l1+l2];
        int index=0;


        for(int i=0;i<l1;i++){

            arr[index++]=arr1[i];

        }

        for(int j=0;j<l2;j++){
            Boolean found=false;
            for(int k=0;k<l1;k++){
                if(arr2[j]==arr1[k]){
                    found=true;
                    break;
                }

            }
            if(!found){
                arr[index++]=arr2[j];
            }
        }
        System.out.print("Union = ");
        for(int i=0;i<index;i++){
            System.out.print( arr[i]+" ");
        }
        System.out.println();

    }

    public static void intersection(int [] arr1,int [] arr2) {
        int l1= arr1.length;
        int l2=arr2.length;
        int [] arr=new int[l1+l2];

        int index=0;

        for(int i=0;i<l1;i++){
            Boolean found=false;
            for(int j=0;j<l2;j++){
                if(arr1[i]==arr2[j]){
                    found=true;
                }
            }
            if(found){
                arr[index++]=arr1[i];
            }
        }

        System.out.print("Intersection = ");
        for(int i=0;i<index;i++){
            System.out.print( arr[i]+" ");
        }



    }


    public static void main(String[] args) {
        int [] arr1={1,5,3,8,9,10};
        int [] arr2={2,6,4,8,5,22};

        union(arr1,arr2);
        intersection(arr1,arr2);
    }
}


