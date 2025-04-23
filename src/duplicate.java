public class duplicate {
    public static void main(String[] args) {
        String str="hellooooooooool";
        StringBuilder str1= new StringBuilder();

        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);

            if (str1.indexOf(String.valueOf(ch)) == -1) {
                str1.append(ch);
            }

        }
        System.out.println(str1);
    }
}
