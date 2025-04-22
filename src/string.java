public class string {;

    public static void main(String[] args) {
        String str="Hello";
        String str1="Hiiio";
        int count=0;
        for(int i=0;i<=str.length()-1;i++){
            for(int j=0;j<=str.length()-1;j++) {
                if (str.charAt(i) == str1.charAt(j)) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
