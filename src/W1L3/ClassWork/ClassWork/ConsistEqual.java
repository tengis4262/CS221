package W1L3.ClassWork.ClassWork;

import java.util.Comparator;

public class ConsistEqual implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getFname().compareTo(o2.getFname())!=0)
            return o1.getFname().compareTo(o2.getFname());
        else
        if(o1.getLname().compareTo(o2.getLname())!=0)
            return 	(o1.getLname().compareTo(o2.getLname()));
        else
            return Integer.compare(o1.getSid(),o2.getSid());
    }
}
