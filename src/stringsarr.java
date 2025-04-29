public class stringsarr {
    public static void main(String[] args) {
        String[] str={"B","A","D","C"};

        for(int i=0;i<str.length;i++) {
            for (int j = 0; j < str.length - 1 - i; j++) {
                char str1 = str[j].charAt(0);
                char str2 = str[j + 1].charAt(0);

                if (str1 > str2) {
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;

                }


            }
        }

        System.out.println("Sorted Array is :");
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");

        }


    }
}
