class A3{
    public void show(){
        System.out.println("In A show()");
    }
}

class B3 extends A3{
    public void show(){
        System.out.println("In B show()");
    }
}

class C3 extends A3{

    public void show(){
        System.out.println("In C show()");
    }
}

class DynammicDispatch{
    public static void main(String[] args) {
        // this is dynammic polymorphism
        // this is called dynamic dispatch which method will be called we don't know
        A3 obj = new A3();
        obj.show();

        obj = new B3();
        obj.show();

        obj = new C3();
        obj.show();

        A3 obj1 = new B3(); // this is also valid 
        // a object of super class type 
    }
}