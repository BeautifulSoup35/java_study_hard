package chapter07_methods;

import java.util.Scanner;

/*
    Method란 : Java에서는 함수의 개념과 동일함.
    Method: 일련의 동작을 묶어서 정의한 것. 입력한값과 출력값이 존재

    함수(function)와 메서드가 동일한 개념이라면 뭐가 다른가
        : 클래스 내부에 함수를 정의하게 되면 메서드
        java는 모든 함수들이 특정 클래스에 종속되어 있다 그렇기에 전부 메서드에 해당한다
        예로 들면 파이썬에선 그 둘의 호출방법이 다르다 그래서 구분하지만 java 에서는 동일

        호출방식
        1. 클래스명.메서드명();
        2. 객체명.메서드명() -> scanner.nextInt() ->메서드
        3. 메서드명() -> 이게 함수 아닌가 의문 가질수있다

        method 정의 : 특정한 메서드를 클래스 내에 만드는 것
        호출법 :main method나 혹은 클래스의method내에서 클래스명.메서드명() 혹은 암튼 위에 1, 2,3방식 사용

        java메서드
        1) method: 특정 작업을 수행하는 코드 블럭을 정의하는 방법
        사진을 찍는다
        1) 주머니에서 폰을 꺼내고
        2) 잠금 화면을 풀고
        3) 카메라를 켜고
        등등
        컴퓨터는 시키는 대로만 함 저 순서를 모두 명령어로 입력해야한다
        하지만 매번 그러기 번거롭다 그저 사진을찍는다는 메서드 안에 저 방법들을 미리 넣어 두는것
        메스드 사용시 자동으로 1 -3 번 순차적으로 수행함

        2)메서드 관련 용어정리
        1. 메서드 : 사용자가 메서드를 새로 만드는것
        2. 인수: 메서드에 전달할 입력
        3. 매개변수: 인수를 받아 저장하는 변수명
        4. 반환값 출력값 리턴값: 메서드의 출력
        5. 메서드 호출: 메서드 실제로 사용하는것

 */
public class Method01 {
    // 메서드 정의를 여기다가 할 예정이다  main 메서드가 없거나 아래있는 경우 있을것이다

    //1. [x(없다) | x][입력값 / 출력값]
    public static void call1(){
        System.out.println("[x | x]");
    }

    //2.[o | x]
    public static void call2(String strExample){//정의 단계에서 (매개변수) 파라미터(출력값) 있음
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 :" + strExample);
    }
    //3 [ x | o ]
    public static String call3(){// return 되는 자료형이 String임을 명시해줌
        System.out.println("[ x | o ]");

        String result = "";

        for (int i =0; i<3; i++){
            for (int j =0; j <i+1; j++){
                result += "👍";
            }
            result += "\n";
        }//print문이 없다
        //result라는 문자열에 데이터들을 저장만 했지 출력하라고 한 적 없음

        return result;
    }

    //4
    public static String call4(int year, int month, int date, String day){
        System.out.println("[o | o]");
        return year +"년 " + month+"월 "+ date+"일 "+day+"요일";
    }
    /*
         함수형 프로그래밍:
            메서드1의 return값이 메서드2의 agu가 되고, 메서드2의 return값이 메서드 3의 agu가 되는 방식으로

            첫번째 메서드 부터 마지막 메스드까지 흐름을 통해
            프로그램이 이어지는 방식을 의미함
     */
    // 함수형 프로그래밍 예시
    public static String introduce(String name, int age){

        return "제 이름은"+(name)+"이고, 나이는,"+(age) +"살입니다 내년에"+(age+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myName ="" ;
        int myAge =0;
        System.out.print("이름을 입력하세요>>>>");
        myName = scanner.nextLine();
        System.out.print("나이를 입력하세요>>>");
        myAge =scanner.nextInt();
        //scanner 메서드를 이용하여 그 return값을 변수에 저장함

        System.out.println(introduce(myName, myAge));
        //name, age 매개변수에 각각myname myage arg을 집어넣음


//        call1();
//        call2("웹 수업 잘하기 👍");//호출단계에서 () 내에 있는 것은 argument(인수)
//        call3();// for 문의 결과값이 나오지 않는다.
//
//        System.out.println(call3());
//
//        String starWritten = call3();
//        System.out.println(starWritten);// 메서드 값 변수에 대입후 출력하는 방식
//        //객체지향 절차지향 함수형(메서드의 결과값이 새로운 인자로 나타낼수있는) 결과값과 인자값이 연결되게 할 수 있음
//        call4(2025, 2, 5, "수요일");
//        System.out.println(call4(2025, 2, 5, "수"));
//        String finalDate = call4(2025, 2, 5, "수");
//        System.out.println(finalDate);

    }
}





