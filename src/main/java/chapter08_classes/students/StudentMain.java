package chapter08_classes.students;


public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();       //기본 생성자로 만들어진다는 건확인가능
        //하지만 현재 상황에서는 지시사항대로 되진 않음
        //1에대해 모두 정의
        student1.name = "김일";
        student1.studentCode = 20250001;
        student1.score = 4.5;

        Student student2 = new Student(20250001);
        student2.name = "김이";
        student2.score = 100;

        Student student3 = new Student("김삼");
        student3.studentCode = 20250003;
        student3.score = 95.8;

        Student student4 = new Student("김사", 20250004);
        student4.score = 4.0;

        student1.showInFo();
        student2.showInFo();
        student3.showInFo();
        student4.showInFo();


    }
}
