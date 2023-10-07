class A{
    A(){
        super();
        System.out.println("In default constructor of class A");
    }
    A(int a){
        super();
        System.out.println("In parameterized constructor of class A --> int value " + a);
    }
}
// every class extends object class 
class B extends A{
    B(){
        System.out.println("In default constructor of class B");
    }
    B(int a){
        //super(); // call default constructor of super class (super base class)
       // super(a); // call parameterized constructor of super class (super base class)
        this(); // this will call the constructor of same class
        System.out.println("In parameterized constructor of class B --> int value " + a);
    }
}

// when we call a constructor for sub-class the base class constructor is also called
// if we call a parameterized constructor of derived class then default constructor of base class is also executed

// super() - every constructor has first statement as super we can't see it but it is there.

class keyword{
    public static void main(String[] args) {
        B b1 = new B(5);
        new A(); // anonymous object - because we have specified a reference 
        new A(7);
    }
}