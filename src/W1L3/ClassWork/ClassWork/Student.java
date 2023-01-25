package W1L3.ClassWork.ClassWork;

public class Student implements Comparable<Student> {
    private int sid;
    private String fname, lname;
    private int score;

    public Student(int sid, String fname, String lname, int score) {
        this.sid = sid;
        this.fname = fname;
        this.lname = lname;
        this.score = score;
    }

    public int getSid() {
        return sid;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.score,o.score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score && fname.equals(student.fname) && sid == student.sid && lname.equals(student.lname);
    }

}
