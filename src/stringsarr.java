public class stringsarr {
    public static void main(String[] args) {

        String[] str={"B","A","D","C"};
        StringBuilder sb=new StringBuilder();


        for(int i=0;i<str.length;i++) {
            char ch=str[i].charAt(0);
            ch= (char) (ch+22);
            sb.append(ch);







        }

        System.out.println("Sorted Array is :");
        for(int i=0;i<str.length;i++){
            System.out.print(sb.charAt(i)+" ");

        }


    }
}
