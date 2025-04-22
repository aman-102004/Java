public class invertedtriangle2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for (int j=5;j>=i;j--){
                System.out.print("*");
            }

            for(int l=5;l>i;l--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
