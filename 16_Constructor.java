class sample{
    int a;

    // defualt constructor
    sample(){
        System.out.println("Default Constructor.");
    }

    // paramerterized constructor
    sample(int a){
        System.out.println("Parameterized Constructor  --> int value " + a);
    }
}

class Constructor{
    public static void main(String[] args) {
        sample s1 = new sample();
        sample s2 = new sample(5);
    }
}