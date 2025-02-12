package chapter08_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {

        //ClassA  scanner와 유사
        // 객체 방식
        ClassA classA1 = new ClassA();// 객체 생성함
        //클래스명 객체명 = new 클래스명();     ->왜 () 해야하는지 추후에

        Scanner scanner = new Scanner(System.in);   // ->Scanner 클래스의 instance인 scanner를 생성해 왔던것이다.
        Scanner sc = new Scanner(System.in);   // ->Scanner 클래스의 instance인 scanner를 생성해 왔던것이다.
//        scanner.nextLine();//무슨 클래스의 인스턴스로 특징을 갖는지 모름

//        System.out.println("이름을 입력하세요>>>");
//        System.out.println("나이을 입력하세요>>>");
//        // classA1 객체의 name이라는 속성에 값을 대입
//        classA1.name = scanner.nextLine();
//        //classA1 객체의 num 속성에 값 대입
//        classA1.num = sc.nextInt();

        System.out.println(classA1.name);
        System.out.println(classA1.num);

        //이상의 코드에서 확인할수있는 부분:
        //특정 객체의 속성을 참조하기 위해서는
        //"객체명.속성명"으로 할 수 있습니다.

        //메서드 호출 방법
        classA1.name = "미3누"; //속성에 값 그냥 대입
        classA1.callName();

        /*
        classa2 생성

         */
        //객체생성
        ClassA classA2 = new ClassA();
        classA2.score = 4.5;// 점수 대체 한다면 double로 작성
        //속성에 값 대입
        System.out.print("이름을 입력하세요>>>");
        classA2.name =scanner.nextLine();
        System.out.print("나이을 입력하세요>>>");
        classA2.num =scanner.nextInt();
        System.out.println("class2의 이름은"+classA2.name+" 이고" +
                " 나이는" + classA2.num +"입니다. 이번학기 점수는"+classA2.score+"입니다.");
        classA2.callName();

        //메서드는 행위다

    }
}
