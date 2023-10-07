class SimpleCalc{
    // add and sub

    void add(int a,int b){
        System.out.println("Add - " + (a+b));
    }

    void sub(int a,int b){
        System.out.println("Sub - " + (a-b));
    }
}

// Inheritance - a base class derives a derived class which has properties of the base class
// Java does not support multiple inheritance
// In multiple inheritance a single class dervied from 2 base classes
// an ambiguity is created when both base class have same named function and the function is called using derived class object 
// java class cannot extend 2 classes
class AdvanceCalc extends SimpleCalc{
    // power and multiplication

    void power(int a,int b){
        System.out.println("a^b - " + (Math.pow(a, b)));
    }
    void prod(int a,int b){
        System.out.println("prod - " + (a*b));
    }
}

class Inheritance{
    public static void main(String[] args) {
        AdvanceCalc a1 = new AdvanceCalc();
        a1.add(2, 3);
        a1.sub(2, 3);
        a1.power(2, 3);
        a1.prod(2, 3);
    }
}