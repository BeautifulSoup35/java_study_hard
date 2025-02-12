package chapter08_classes.students;
/*
     생성자를 자동으로 생성방법
     alt + ins

     필드를 기준으로 생성잘르 만들지 선택
     복수 선택시에는 복수의 매개변수를 가진 매개변수 생성자

     타이핑 끝
 */
public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(String name) {
        this.name = name;
    }

    public Student2(int studentCode) {
        this.studentCode = studentCode;
    }

    public Student2() {
        System.out.println("기본생성자");
    }
}
