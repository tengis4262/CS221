package W1L2.Assignment.Problem2;

import java.util.Arrays;

public class StudentArray {
    private Student[] a;
    final int initialCapacity =10;
    private int nElems;
    int capacity;




    public StudentArray(int max){
        nElems = 0;
        a = new Student[initialCapacity];
    }
    public StudentArray(){
        capacity = initialCapacity;
        nElems =0;
        a= new Student[capacity];
    }

//    public Student find(int id){
//        for (Student stu:a) {
//            if(stu.getId()==id)
//                System.out.printf("Student with %d%n ", id, "has been found");
//            else
//                System.out.printf("Student with %d%n ", id, "has not found");
//        }
//    }

    public void insert(int id, String name, int mark){
        if(id==0 && name.equals(null) && mark==0)
            return;
        if(nElems==initialCapacity){
            reallocate();
        }
        a[nElems] = new Student(id,name,mark);
    }
    private void reallocate() {
        nElems = 2 * a.length;
        a = Arrays.copyOf(a, nElems);
    }
    public void displayAll(){
         a.toString();
    }

    public static void main(String[] args) {
        StudentArray stuArr = new StudentArray();
        stuArr.insert(143,"Tengis Erdenebaatar", 91);
        stuArr.insert(141,"Zelalem Ambisa", 92);
        stuArr.insert(142,"Nishesh Acharya", 93);

       // for (StudentArray stu:stuArr) {
           // stu.displayAll();
        }

    }

