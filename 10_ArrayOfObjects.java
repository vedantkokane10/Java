class Student{
    public int roll;
    public int marks;
    Student(){
        roll = marks = 0;
    }
}

class ArrayOfObjects{
    public static void main(String[] args) {
        Student s[] = new Student[3];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println("ejej");
        s1.roll = 30;
        s1.marks = 23;
        s2.roll = 10;
        s2.marks = 22;
        s3.roll = 22;
        s3.marks = 21;
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        for(int i=0;i<s.length;i++){
            System.out.println("Roll no - " + s[i].roll + " , marks - " + s[i].marks);
        }
    }
}