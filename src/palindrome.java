public class palindrome {
    public static void main(String[] args) {
        String str="naman";
        int a=0,b=str.length()-1;
        boolean ispalindrome=true;

        while(a<b){
            if(str.charAt(a)!=str.charAt(b))
            {
                ispalindrome=false;
            }
            a++;
            b--;
        }
        if(ispalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }





    }
}
