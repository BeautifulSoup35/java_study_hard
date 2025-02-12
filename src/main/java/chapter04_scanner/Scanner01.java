package chapter04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner 클래스 import
       Scanner scanner = new Scanner(System.in);
//        System.out.print("올해 년도를 입력하세요 >>");//print와 println의 차이
//        int year = scanner.nextInt();// 더 적합한 자료형 next는 메서드 관련
////        double years = scanner.nextDouble();
//        System.out.println(year);
        /*
        String은?
         */
        String year1 = scanner.nextLine();
        System.out.println("올해 년도는 "+ year1 +"입니다.");
        System.out.println("내년의 년도는 "+ (year1 + 1)  + "입니다.");
        /*
        scanner 를 사용했을때 그 결과값을 변수에 대입하는 경우, 변수의 자료형이 매우 중요합니다
        콜솔창에 사용자가 입력할수 있는 방법
        그리고 그 결과값을 각각 변수에 넣는것
        즉 결과값이 변수에 대입됐음 -> 대입 연산자의 =개념연관
        int bouble line 각각 next 고르기
         */

    }
}
