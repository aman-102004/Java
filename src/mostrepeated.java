public class mostrepeated {
    public static void main(String[] args) {
        String str="hellllllooooooooo";
        int MaxCount=0;
        char MaxChar=' ';

        for(int i=0;i<str.length();i++){
            char currentchar=str.charAt(i);
            int count=0;

            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==currentchar){
                    count++;
                }
            }

            if(count>MaxCount){
                MaxCount=count;
                MaxChar=currentchar;
            }

        }

        System.out.println("Most occurring character: " + MaxChar);
        System.out.println("Number of occurrences: " + MaxCount);

    }
}
