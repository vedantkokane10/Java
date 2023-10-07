class Mobile{
    String brand;
    int price;
    static String name; // static variable only 1 instance is created 

    static{
        // static block only once irrespective the no of times the object is called
        // called before object initialized
        // used to initialize static variables
        System.out.println("Static block statement");
        System.out.println("name - " + name);
    }

    static void show(){
        // static function can only access static data menbers
        // we can access non-static memebers but we need object reference for that
        // static function can be accessed by directly class name
        System.out.println("In static function");
        System.out.println(name);
    }
}

// static variable only has 1 copy maintained in the meomary and shared by each object
// if value is changed then every object has to deal with the changed value
// static variables can be accessed by directly class name
class Static{
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.price = 1000;
        m1.brand = "apple";
        m1.name = "Smartphone";

        System.out.println(m1.price + " , " + m1.brand + " , " + m1.name);
        Mobile m2 = new Mobile();
        m2.price = 500;
        m2.brand = "samsung";
        Mobile.name = "phone"; 
        Mobile.show();
        System.out.println(m2.price + " , " + m2.brand + " , " + m2.name);
        System.out.println(m1.price + " , " + m1.brand + " , " + m1.name);
    }
}
