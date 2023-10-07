class A4{
    public void show(){
        System.out.println("In A4's show()");
    }
}

// we can change the behavoiur of method with the help of anonymous class
// used when method is to be used only once
class AnonymousClass{
    public static void main(String[] args) {
        A4 obj = new A4()
        {
            public void show(){
                System.out.println("In new show()");
            }
        };

        obj.show();

    }
}