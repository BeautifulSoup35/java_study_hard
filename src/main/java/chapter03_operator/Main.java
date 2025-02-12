package chapter03_operator;

public class Main {
    public static void main(String[] args) {
        //
//        int i = 10;
//        System.out.println(i);
//
//        //대입연산자 =,오른쪽걸 왼쪽에 대입
//        i = i+1;//변수명 i에 10 + 1 재대입
//        System.out.println(i);
//
//        /*
//        복합대입 연산자
//        1) +=
//        2)-=
//        3) *=
//        4) /=
//         */
//
//        int num = 1;
//        System.out.println(num);
//        num += 2;
//        System.out.println(num);
//        num -= 1;
//        System.out.println(num);
//        num *= 10;
//        System.out.println(num);
//        num /= 5;
//        System.out.println(num);

        int j = 10;
        System.out.println(j);
        System.out.println(j++);//출력값 10; 코드를 실행시킨후  j에 1을 더해라
        System.out.println(j);//출력값11;
        System.out.println(++j);// 출력값 12;코드를 실행시키기 전 j에 1을 더할것
        System.out.println(j--);//12 대입먼저
        System.out.println(j);//11
        System.out.println(--j); //10
        System.out.println(j);//10

        /*
        일반수식 연산자+ - * /
        % 나머지 연산자 -> 홀짝 구분시 사용
         */
        System.out.println("10/ 2의 나머지" + 10%2);
        System.out.println("10/ 4의 나머지" + 10%4);
    }
}
