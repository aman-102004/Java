import java.sql.SQLOutput;
import java.util.Scanner;
public class userinput {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter the Value of A");
        float a= in.nextInt();
        System.out.println("Enter the Value of B");
        float b=in.nextInt();
        System.out.println("Enter the Operator(+,-,*,/)");
        char c=in.next().charAt(0);

        switch (c){
            case '+':
                System.out.println("Additon of "+ a + " & "+ b +" is "+(a+b) );
                break;
            case '-':
                System.out.println("Subtraction of "+ a + " & "+ b +" is "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of "+ a + " & "+ b +" is "+(a*b) );
                break;
            case '/':
                System.out.println("Division of "+ a + " & "+ b +" is "+(float)(a/b) );
                break;
        }


    }
}
