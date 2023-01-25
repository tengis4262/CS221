package W1L3.ClassWork.ClassWork;

import java.util.ArrayList;

public class TestEquals { public static void main(String[] args) {

    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new Student(123456, "Amala", "Kamala", 86));
    list.add(new Student(123457, "Adhi", "Harris", 78));
    list.add(new Student(123458, "Akil", "Tomahawk", 80));
    list.add(new Student(123459, "Arun", "Bandghi", 76));

    Student sd1 = new Student(123456, "Amala", "Kamala", 86);
    Student sd2 = new Student(123456, "Amala", "Kamala", 86);
    Student sd3 = new Student(1234, "Amala", "Kama", 86);

    boolean res = sd1.equals(sd2);
    System.out.println(" Object equal ? " + res);

    res = sd1.equals(sd3);
    System.out.println("Object equal ? " + res);
    lNameSort ln =  new lNameSort();

    int val = ln.compare(sd1,sd2);
    int val1 = ln.compare(sd1,sd3);
    System.out.println("Testing if 2 objects lName equal or not : " + val);
    System.out.println("Testing if 2 objects lName equal or not : " + val1);



}
}
