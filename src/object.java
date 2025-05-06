class Student{
    String str="Aman";
    String str2="Vishwakarma";

    void fullname(){
        System.out.println(str+" "+str2);
    }
}

public class object {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.fullname();


    }
}
