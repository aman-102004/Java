public class array2ndlargest {
    public static void main(String[] args) {
        int [] arr={1,64,232,78,32329,97};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

                }

            }
        System.out.println(arr[1]);
        }
    }

