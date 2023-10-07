@FunctionalInterface // an interface can have only 1 function 
interface I{
    int add(int x,int y);
}

// lambda function only works with functionalInterface
// because we can use only 1 function

/*
 Types of Interface
 1. Normal - it can have multiple methods
 2. Functional / SAM - only 1 method
 3. Marker - it has no method
 */
class LambdaFunction {
    public static void main(String[] args) {
        // I obj = (x,y) ->{ // this is a lambda function
        //     System.out.println("In interface , addition is = " + (x+y));
        //     return x+y;
        // };
        I obj = (x,y) -> x+y; 
        /*
         The above lambda function is equivalent to
         I obj = new I(){
            int add(int x,int y){
                ----- Statements
            }    
         };
         */
         int result = obj.add( 3,4);
         System.out.println(result);

      //  obj.add(2,6);
    }
}
