class MethodOverload{


    public int add(int num1,int num2){
        int result = num1 + num2;
        System.out.println("Addition = " + result);
        return result;
    }

    public int add(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        System.out.println("Addition = " + result);
        return result;
    }

    public double add(double num1,double num2){
        double result = num1 + num2;
        System.out.println("Addition = " + result);
        return result;
    }
    
}

class Methdod {
    public static void main(String[] args) {
        MethodOverload object1 = new MethodOverload();
        MethodOverload object2 = new MethodOverload();
        System.out.println("For int with 2 numbers - ");
        object1.add(3,4);
        System.out.println(" ");
        System.out.println("For Double - ");
        object2.add(2.34,4.55);
        System.out.println(" ");
        System.out.println("For int with 3 numbers - ");
        object1.add(3,4,6);
        System.out.println(" ");
    }
}


/*
In method overloading the function has same name but different type of paramenters or different no of parameters.
Ex - 
add 2 int
add 2 float
add 3 int
all have same name
 */
