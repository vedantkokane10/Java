interface AI{
    int a = 3; // variables are by default static and final because interface does not have any meomary in heap
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{

}

// interface means design not impleentation 
// it is like abstract functions
// we cannot create object of interface
// a class can extend interface using implements
// all interface functions are public 


class B4 implements AI , X // OR Y 
{
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }

    public void run(){
        System.out.println("in run");
    }
}


// interface --> interface = extends
// interface --> class = implements 
// class --> class = extends

class Interfaces{
    public static void main(String[] args) {
        B4 obj = new B4();
        obj.config();
        obj.run();
    }
}