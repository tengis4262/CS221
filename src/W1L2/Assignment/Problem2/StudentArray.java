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
    public int size(){
        return this.nElems;
    }
    public Student get(int i){
        return a[i];
    }
    public Student find(int id){
        for (int i=0;i<size();i++) {
            if(a[i].getId() == id){
                System.out.println("Student with " +id+ " has been found");
                return a[i];
            }
        }
        System.out.println("Student with "+ id+ " has not found");
        return null;
    }
    public boolean check(int id){
        for (int i=0;i<size();i++) {
            if(a[i].getId() == id){
//                System.out.println("Student with " +id+ " has been found");
                return true;
            }
        }
//        System.out.println("Student with "+ id+ " has not found");
        return false;
    }
    public void
    insert(int id, String name, int mark){
        if(id==0 && name.equals(null) && mark==0)
            return;
        if(check(id)){
            return;
        }
        if(nElems==capacity){
            reallocate();

        }
        a[nElems] = new Student(id,name,mark);
        nElems++;

    }

    private void reallocate() {
        nElems = 2 * a.length;
        a = Arrays.copyOf(a, nElems);
    }
    public void displayAll(){
        for(int i=0;i<this.size();i++){
            a[i].displayStudent();
        }
    }
//    public boolean remove(int id){
//        if()
//    }

    public static void main(String[] args) {
        StudentArray stuArr = new StudentArray();
        stuArr.insert(143,"Tengis Erdenebaatar", 91);
        stuArr.insert(141,"Zelalem Ambisa", 92);
        stuArr.insert(142,"Nishesh Acharya", 93);
        stuArr.insert(142,"Nishesh Acharya", 93);
        stuArr.displayAll();
        stuArr.find(140);
        }
    }

