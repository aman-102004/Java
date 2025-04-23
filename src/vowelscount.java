public class vowelscount {

    public static void main(String[] args) {
        String vowels="uewwoeweouweui";
        int count=0;

        for(int i=0;i<=vowels.length()-1;i++){
            if(vowels.charAt(i)=='a'||vowels.charAt(i)=='e'||vowels.charAt(i)=='i'||vowels.charAt(i)=='o'||vowels.charAt(i)=='u'){
                count++;

            }

        }
        System.out.println(count);

    }



}
