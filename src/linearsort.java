public class linearsort {
    public static int linearsearch(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            int found=0;
            if(target==arr[i]){

                return i;
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={22,44,23,67,34};
        int target=67;
        System.out.println(linearsearch(arr,target));
    }
}
