package W1L2.Assignment.Problem2;

import java.util.Arrays;

public class StudentArr {
    private Student[] students;
    final int INITIAL_CAP =10;
    private int nElems;
    private int capacity;
    public StudentArr(int max){
        this.capacity = 0;
        students = new Student[max];
    }
    public StudentArr(){
        this.capacity = 0;
        students = new Student[INITIAL_CAP];
    }
    public int size(){
        return this.capacity;
    }
    public Student get(int index){
        if(index<0 || index>=capacity) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return students[index];
    }
    private void reallocate() {
        int increased = 2 * students.length;
        Student[] temp = new Student[increased];
        students = Arrays.copyOf(students, nElems);
    }
    public void add(){

    }
}
