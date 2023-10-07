class Calculator{
    int num1,num2;
    Calculator(){
        num1 = num2 = 0;
    }
    Calculator(int x,int y){
        num1 = x;
        num2 = y;
    }

    public int add(){
        int result = num1 + num2;
        System.out.println("Addition = " + result);
        return result;
    }

    public int sub(){
        int result = num1 - num2;
        System.out.println("Subtraction = " + result);
        return result;
    }

    public int product(){
        int result = num1 * num2;
        System.out.println("Multiplication = " + result);
        return result;
    }
    public int division(){
        if(num2 == 0 ){
            System.out.println("Division = " + 0);
            return 0;
        }
        int result = num1 / num2;
        System.out.println("Division = " + result);
        return result;
    }
}

class Classes {
    public static void main(String[] args) {
        Calculator object1 = new Calculator();
        Calculator object2 = new Calculator(3,4);
        System.out.println("For object1 - ");
        object1.add();
        object1.sub();
        object1.product();
        object1.division();
        System.out.println(" ");
        System.out.println("For object2 - ");
        object2.add();
        object2.sub();
        object2.product();
        object2.division();
    }
}


/*
 Class access modes -
 default,public,private,protected
 deault - members are accessible within class and package (if no access specifier is given then it is default)
 public - members are accessible anywhere in program
 private - members are accessible only within class
 protected - members are accessible only within class and sub-class (used in inheritance)

 we cannot have 2 public classes in same file

Objects - 
In Java object are dynamically created and automatic garbage collection is supported by java so it deletes the object
which go out of reference we don't have to manually delete objects.
If we want the object to perform some operation before the object gets out of refrence and deleted then we can the oprations
of the object inside "finally" block where the operations will be performed before deletion of the object. 


 */