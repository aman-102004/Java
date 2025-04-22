public class digitevenorodd {
    public static void main(String[] args) {
        int sum=123;
        int even=0;
        int odd=0;
        int temp;

        for(int i=0;i<3;i++){

            temp=sum%10;
            sum=sum/10;
            if(temp%2==0){
                even++;

            }
            else{
                odd++;
            }

        }
        System.out.println("Even No: "+ even);
        System.out.println("Odd No: "+odd);
    }
}
