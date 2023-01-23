package W1L3.ClassWork.ClassWork;

import java.util.Comparator;

public class lNameSort implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLname().compareTo(o2.getLname());
    }
}
