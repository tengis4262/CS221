package W1L3.ClassWork.ClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentSort {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(123456,"Amala","Kamala",86));
        list.add(new Student(123457,"Adhi","Harris",78));
        list.add(new Student(123458,"Akil","Tomahawk",80));
        list.add(new Student(123459,"Arun","Bandghi",76));

        System.out.println("Before sort by Student score");
        for (Student s:list) {
            System.out.println(s);
        }

        Collections.sort(list);
        System.out.println("After sorting by Student score");
        for (Student s:list) {
            System.out.println(s);
        }
//        Iterator<Student> st1 = list.iterator();
//        while(st1.hasNext()){
//            System.out.println(st1.hasNext());
//
//        }
        Collections.sort(list, new Comparator<Student>() { //sort by sId
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getSid() , o2.getSid());
            }
        });
        //
        lNameSort ln = new lNameSort();
        Collections.sort(list,ln);
        System.out.println(list);

        for (Student stu:list) {
            System.out.println(stu);
        }
    }

}
