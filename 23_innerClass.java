class A3{
    public void show(){
        System.out.println("In show");
    }

    class B3{
       public void config(){
            System.out.println("In config");
        }
    }
}

// inner class - a class within a class
class InnerClass {
    public static void main(String[] args) {
        A3 obj = new A3();
        obj.show();
       //  B3 obj1 = new B3(); // error
       A3.B3 obj1 = obj.new B3();
       obj1.config();
    }
}
