public class twodarray {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {4,10,6},
                {7,8,9}
        };
        int max=arr[0][0];
        for(int i=0;i< arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }


        }
        System.out.println("Max Element is :"+max);
//        System.out.println("The sum of the row "+" is "+ rowsum);
    }
}
