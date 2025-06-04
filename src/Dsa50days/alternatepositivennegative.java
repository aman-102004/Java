package Dsa50days;

public class alternatepositivennegative {

    public static void alternate(int[] arr) {

        int [] posarr=new int[arr.length];
        int [] negarr=new int[arr.length];
        int n=0,p=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posarr[p]=arr[i];
                p++;

            }
            else{
                negarr[n]=arr[i];
                n++;
            }
        }
        int num=0,num1=0,num2=0;




            if (p == n) {
                for(int i=0 ;i<arr.length/2;i++) {
                    arr[num++] = posarr[num1++];
                    arr[num++] = negarr[num2++];
                }

            } else {
                System.out.println("Positive and Negative Numbers are not in Equal Numbers");
                return;
            }

        for(int num3:arr){
            System.out.print(num3+" ");
        }





    }

    public static void main(String[] args) {
        int[] arr = {-2, -5, -1, 1, 2, 5};
        alternate(arr);
    }
}

