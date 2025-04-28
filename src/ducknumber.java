import java.util.Scanner;

public class ducknumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        String num;
        num=sc.nextLine();
        boolean isduck=false;
        if(num.charAt(0)=='0'){
            System.out.println(num+"is not a duck num");
        }

        else{

            for(int i=0;i<num.length();i++){
                if(num.charAt(i)=='0'){
                    isduck=true;
                    break;
                }

            }

        }
        if(isduck){
            System.out.println("Num is a duck number");
        }
        else{
            System.out.println("Num is not a duck number");
        }

    }
}
