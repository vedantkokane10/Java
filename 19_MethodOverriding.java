class A1{
    public int add(int a,int b){
        System.out.println("Base add - " + (a+b));
        return a+b;
    }   
}

class B1 extends A1{
    public int add(int a,int b){
        System.out.println("Derived add - " + (a+b+1));
        return a+b+1;
    }
}

class MethodOverriding{
    public static void main(String[] args) {
        B1 obj = new B1();
        int r1 = obj.add(2, 3);
        int r2 = obj.add(4,5);
        System.out.println(r1 + " " + r2);
        
    }
}

