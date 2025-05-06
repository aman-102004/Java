 class reference {
    void sum(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        reference obj=new reference();
        System.out.println(obj);
        obj.sum();
    }
}
