// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String str="naman";
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not A Palindrome");
        }




    }


    }

