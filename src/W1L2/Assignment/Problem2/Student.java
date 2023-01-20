package W1L2.Assignment.Problem2;

public class Student {
    private int stuId;
    private String name;
    private int mark;

    public Student(int stuId, String name, int mark) {
        this.stuId = stuId;
        this.name = name;
        this.mark = mark;
    }
    public void displayStudent(){
        System.out.printf("Student id : %d%n", stuId,"Student name : %s%n" , name,"Student mark : %d%n", mark);
    }
    public int getId(){
        return stuId;
    }
    @Override
    public String toString(){
        return "Student id : " + stuId + "\nStudent name : " + name +"\nStudent mark : " + mark;
    }
}
