package chapter01_variable;
/*
변수 variable 데이터 담는 바구니
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(3.141592);
        //원의 둘레
        //7번 라인에 있는 원주률을 이용하여 지금이 19인 원의 둘레를 구하시오
        // sout
//        System.out.println(19*3.141592);
//
//        //  자료형 변수형 = 데이터 ; -> 변스 방법
//        double pi = 3.141592; // 변수의 선언 및 초기화
//        System.out.println(23 * pi);
//        int age;//선언
//        age = 38;//초기화 : 대입

        /*
        java 변수 선언 방식
        카멜 표기법 : 첫문자는 소문자 복수 단어일때 두번째 단어의 첫 문자만 대문자로 쓴다
        String example
        스네이크 케이스
        1. 논ㄹ;향 지려향 : 참거짓

         */
//        boolean checkFlag = false; //변수의 선언 및 초기화
//        System.out.println(checkFlag);
//        checkFlag = true;// 이미 선언된 변수는 자료형을 적지 않
//        System.out.println(checkFlag);
//
////        checkFlag2 처음나올때 자료혀 안적음
//        boolean checkFlag3 = true;//동시에
//        boolean checkFlag4;//변수의 선언
//        checkFlag4 = false; //초기화
//
//        /*
//        자료형을 명시하고 값을 대입하여 초기화
//        추후 해당 변수에 재대입 하는 경우
//
//         */
//        char name1 = '안';
//        char name2 = '근';
//        char name3 = '수';//문자
//        System.out.println(name1 + name2 + name3);//144732; 문자의 합이라 문자열로 처리를 못함: 자료형 불일치
//        System.out.println("" + name1 + name2 + name3);//안근수
//        /*
//        큰따옴표와 작은 따옴표의 차이점
//        문자와 문자열은 서로 다르다
//        java에서  sout 의 경우 괄호 맨 앞 부분의 자료형을 따라가는 경우가 있다
//        즉, 큰 따옴표로 시작하면 괄호안의 전부를 문자열로 본다
//        콘솔창에 여러분의 이름 출력
//         */
//        char name4 = '권';
//        char name5 = '민';
//        char name6 = '주';
//        System.out.println(""+ name4 + name5 + name6);
//
     //3.  정수 자료형
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);// 숫자끼리의 연산
        /*
        int : Integer 축약어 정수
        실수에 해당하는 자료형 double

        4. 실수 자료형 변수

         */
        double pi = 3.141592;
//        int pi2 = 3.14 => 자료형 불일치
//        int longNum = 12345689122345;
        long longNum2 = 12345689122345L;

        // 5.문자열 자료형
        /*
        String : 문자들이 일정한 순서를 지니고 나열된 것을 의미함.(대문자로 시작)
         */
        String name =  "권민주";
        int age = 30;
        System.out.println("저는 "+ name +"입니다");

        //다음주 다중 라인에 걸친 string

/*
    원래 java 17이전까지는 string 한줄만가능(enter안됨)/n
    다중 스트링 지원하게 됨
 */
//        String introduction =

        /*
        다중string

        int long

         int (4 바이트, 32 비트)
                최소값: -2,147,483,648 (−2^31)
                최대값: 2,147,483,647 (2^31 − 1)
            long (8 바이트, 64 비트)
                최소값: -9,223,372,036,854,775,808 (−2^63)
                최대값: 9,223,372,036,854,775,807 (2^63 − 1)

         5.상수 -> 변수와 반대
            특징:
                1) 한번의 선언 및 초기화가 가능 -> 재대입 불가능
                2) 이미 초기화가 끝난 상수를 한참 밑에서 불러올 경우 걔가 상수인지
                 변수인지가시적으로 확인이 불가능 즉 상수는 전부 대문자, 단어와 단어사이 공백을 _으로 연결
                3) final 키워드 존재
         */
        // 자료형 변수명 = 데이터;

        final int FINAL_NUM = 123;//기본 형식
//        FINAL_NUM = 234; -> 오류
        System.out.println(FINAL_NUM);
//        final String FILE_PATH = ;//잘안바뀌는 주소

        /*

         */

    }
}
