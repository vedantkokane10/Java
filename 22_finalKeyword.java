// final keyword is to make something constant
// final variables ,methods, class
// variables - to assign constant values
// methods - to avoid method overriding
// class - to avoid inheritance

class FinalMethod{
    public final void show(){
        System.out.println("In FinalMethod show");
    }
}

class FinalMethod2 extends FinalMethod{
    // this will give error
    // public void show(){
    //     System.out.println("In FinalMethod2 show");
    // }
}

class FinalKeyword{
    public static void main(String[] args) {
        final int a = 10;
        // a = 15 ; --> this will give error
    }
}