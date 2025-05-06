public class constructor {

    public static void main(String[] args) {
        class student{
            int a;

            student(int a){
                this.a=a;
            }

            void sum(){
                System.out.println(a);
            }
        }

        student obj=new student(10);
        obj.sum();
    }
}
