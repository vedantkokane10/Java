package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    public int age;
    public String name;

    Student(int a, String s) {
        age = a;
        name = s;
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1; // if 1 then swap
        }
        return -1;
    }

    @Override
    public String toString() {
        System.out.println("Age = " + age + " , "  + " Name = " + name);
        return super.toString();
    }
}

class CompareSort {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        st.add(new Student(13, "john"));
        st.add(new Student(15, "josh"));
        st.add(new Student(8, "jack"));
        st.add(new Student(11, "ryan"));
        // before sorting
        for (Object x : st) {
           // System.out.println(x);
           x.toString();
        }

        Collections.sort(st);
        // after sorting
        for (Object x : st) {
            x.toString();
        }
    }
}