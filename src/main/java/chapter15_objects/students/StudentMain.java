package chapter15_objects.students;
/*
    클래스 필드 anme, stdentId
    재정의하여 톤솔에 찍히게
    객체 생성했을때 속성값이 뭔지
 */
public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("안근수", 20250001);
        Student student2 = new Student("권민주", 20250002);
        System.out.println(student2);
        System.out.println(student1);


    }



}
