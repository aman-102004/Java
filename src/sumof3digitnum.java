public class sumof3digitnum {
    public static void main(String[] args) {
        int sum=123;
        int s=0;

        for(int i=0;i<3;i++){
            s+=sum%10;
            sum=sum/10;
        }
        System.out.println(s);
    }
}
