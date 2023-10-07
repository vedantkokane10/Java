enum Status{
    Running,Pending,Failed,Success;
}

enum Laptop{
    Macbook(2200),ROG(2100),Vostro(2000);
    int price;
    Laptop(int x){
        price = x;
    }

    void printData(){
        System.out.println(price);
    }
}

// enum is like a class but we cannot extend it
class Enums {
    public static void main(String[] args) {
        int i=5;
        Status s = Status.Failed;
        System.out.println(s);
        Status[] s1 = Status.values();
        for(Status x : s1){
            System.out.println(x);
        }
        Status s3 = Status.Success;
        System.out.println(s3.ordinal()); // gives position of the attribute loacated in enum
        if(s3 == Status.Success){
            System.out.println("success //");
        }else{
            System.out.println("Not Success");
        }

        switch (s3) {
            case Success:
            System.out.println("success //");
            break;
            
            case Failed:
            System.out.println("Failed //");
            break;

            default:
                break;
        }

        Laptop l1 = Laptop.Macbook;
        System.out.println(l1.price);
        Laptop l2 = Laptop.ROG;
        l2.printData();
    }
}
