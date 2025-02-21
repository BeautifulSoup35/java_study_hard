package chapter15_objects.students;

public class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "해당 학생의 학번은 " +
                this.studentId+ "이고, 이름은 "+
                this.name+"입니다." + this.getName();
    }
}
