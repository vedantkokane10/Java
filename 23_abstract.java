abstract class  car{
    public abstract void drive(); // abstract keyword is to use to declare a function in a class
    // an class must be abstract to declare a variable and not define it
    // object of abstract class cannot be created
    // the declared method must be defiend in extended class

    public void fuelType(){
        System.out.println("petorl");
    }
}

class Swift extends car{
    public void drive(){
        System.out.println("Driving");
    }
}


class AbstractKeyword{
    public static void main(String[] args) {
        Swift obj = new Swift();
        obj.drive();
        obj.fuelType();
    }
}