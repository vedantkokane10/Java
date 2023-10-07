class Student{
    public int roll;
    public int marks;
    Student(){
        roll = marks = 0;
    }
}

class EnhancedForLoops{
    public static void main(String[] args) {
        Student s[] = new Student[3];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.roll = 30;
        s1.marks = 23;
        s2.roll = 10;
        s2.marks = 22;
        s3.roll = 22;
        s3.marks = 21;
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        for(Student it:s){
            System.out.println("Roll no - " + it.roll + " , marks - " + it.marks);
        }
        int n[] = new int[3];
        n[0] = 1;
        n[1] = 2;
        n[2] = 3;
        for(int x:n){
            System.out.print(x + " ");
        }
    }
}
