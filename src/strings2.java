public class strings2 {
    public static void main(String[] args) {
        String str="helllloooooo";
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();



        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(str1.indexOf(String.valueOf(ch))==-1){
                str1.append(ch);

            }
            else{
                str2.append(ch);
            }
        }

        System.out.println(str2.charAt(0));



    }
}