class Human{
    String name;
    int age;
    // this - it is used to point to the current instance / object
    void getData(String name,int age){
        // when local variable of function and class data members are having same name we can use this keyword
        // to tell compiler the current instance of data members of the class
        this.name = name;
        this.age = age;
    }

    void printData(){
        System.out.println(name + " " + age);
    }
}

class ThisKeyword{
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.getData("vedant",20);
        h1.printData();
    }
}