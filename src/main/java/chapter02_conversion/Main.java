package chapter02_conversion;

public class Main {
    public static void main(String[] args) {
        /*
        형변환 (conversion) 용량상의 문제
        1) 업캐스팅: 더 큰 용량의 자료형으로 변환
         */
        char cast1 = 'A';
        System.out.println("원형 :"+ cast1);
        //업캐스팅의 앙법
        System.out.println("변형: "+ (int)cast1);
        char cast2 = 'a';
        System.out.println("원형 :"+ cast2);
        System.out.println("변형 :"+(int) cast2);

        // 업캐스팅 방법 2
        char cast3 ='b';
        //업캐스팅을 진행할 새로운 변수를 선언해서 대입
        int cast4 =(int) cast3;
        System.out.println("원형:" +cast3);
        System.out.println("변형:" +cast4);
        //용량의 효율

        //2)다운캐스팅 : 더 적은 용량의 자료형으로 변환시키는 것
        int cast5 = 99;//1번 방법
        int cast6=100;//2번
        //지시사항: 업캐스팅을 동원해서 char로 바꾸시오
        System.out.println("변형:"+ (char) cast5);
        char cast7 = (char) cast6;
        System.out.println("변형:" +cast7);

        /*
        추후 수업 예정:up의 경우 용향이 커지기만해 암시적  implicit 으로 변형가능
                        down 메모리 용량 벗어나는 경우가 있을 수 있다
                        -> 다운캐스팅을 하때에는 명시적explicit 으로 합니다.


         */

    }
}
