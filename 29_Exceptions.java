class CustomException extends Exception{
    CustomException(String str){
        super(str);
    }
}

class ExceptionHandling{
    public static void main(String[] args) {
        int a = 10 , b = 0;
        try{
            // try block is used to test the code that may raise an expcetion
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            // exception is thrown in the form of object so have to catch it using object
            // here we used Exception clas but there are multiple classes like ArithmeticException
            System.out.println("Error..... " + e);
        }


        // handling specific exceptions
        int arr[] = new int[3];
        try{
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        

        try{
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch(Exception e){
            // always have parent exception class below
            // Exception is parent class so it should be at the end always before the specific exceptions
            System.out.println("Error");
        }

        // use of throw 
        // it is used to raise a specific exception
        try{
            System.out.println(22/0);
            System.out.println(arr[9]);
            throw new ArithmeticException();
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch(Exception e){
            // always have parent exception class below
            // Exception is parent class so it should be at the end always before the specific exceptions
            System.out.println("Error");
        }

        // use of custom exception
        int k = 10, l =1;
        try{
            System.out.println(k/l);
            if(l == 1){
                throw new CustomException("Cannot divide by 1 , sorry :)");
            }
        }
        catch(CustomException e){
            System.out.println(e);
        }
    }
}