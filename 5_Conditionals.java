class Conditionals {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 33;
        if(x > y && x > z){
            System.out.println("X is greater");
        }
        else if(y > x && y > z){
            System.out.println("Y is greater");
        }
        else{
            System.out.println("Z is greater");
        }

        // ternary operator
        // ?:
        int n = 32;
        int result = (n%2 == 0) ? 10 : 20; // is even print 10 else print 20
        System.out.println(result);


        // switch case
        int day = 5;
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Total days are 7 only");
                break;

        }
    }
    
}
