package chapter03_operator;
/*
논리연산자

true false  컴퓨터가 읽을 수 있는 두 숫자 1, 0
boolean 자료형
AND(&&): 곱연산자, 하나라도  false면 false
OR(||): 합 하나라도 true면 true
NOY(!): 값을 반대로 바꾼다
boolean flag = false;
sout(!flag)
 */
public class Operator01 {
    public static void main(String[] args) {
//        boolean flag = false;
//        System.out.println(!flag);

        boolean flag1 = true;
        boolean flag2 = false;
        boolean result1 = flag1 && flag1;
        System.out.println("t X t" +result1);

        boolean result2 = flag1 && flag2;
        System.out.println("t X f" +result2);

        boolean result3 = flag2 && flag2;
        System.out.println("f X f" +result3);

        boolean result4 = flag1 || flag1;
        System.out.println("t + t" +result4);

        boolean result5 = flag1 || flag2;
        System.out.println("t + f" +result5);

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T+F X T" + result7);

        boolean result8 = 10 % 3 == 0;//== 동일한가
        System.out.println("10 %3 ==0 ? " + result8);

        boolean result9 = 10 % 3 != 0;
        System.out.println("10 %3 ==0 ? " + result9);


    }
}
