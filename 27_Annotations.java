class A5{
    void show(){
        System.out.println("In A5");
    }
}

class B5 extends A5{
    @Override // this is a annotation used to override the super class show method
    void show(){
        System.out.println("In B5");
    }
}

// there are multiple annotations in java

class Annotations {
    public static void main(String[] args) {
        B5 obj = new B5();
        obj.show();
    }
}
