package chapter04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
        scanner.nest -> 띄어쓰기 포함안함
        scanner.nextLine()->띄어쓰기 포함
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("당신의 이름ㅇ르 입력하세요 >>");
//        String name = scanner.nextLine();
//        System.out.println("당신의 이름은 " +name + "입니다");

        /*
        실행 예
        이름을 입력하세요 >>> 이름
        주소입력하세요 (시 구 까지 혹 도 시 까지)
        나이를 입력하세요
         */
//        System.out.print("이름을 입력하세요>>> ");
//        String name = scanner.next();
//        System.out.print("나이를 입력하세요>>> ");
//        int age = scanner.nextInt();
//        System.out.print("주소를 입력하세요>>> ");
//        String address = scanner.nextLine();
//        String address = scanner.next();// 오류 없음
        System.out.println("");
        /*
        띄어쓰기가 허용되기 때문에 next라인이후 enter를 눌러 생기는 문제
        문제 해결 방안
         */
        System.out.print("이름을 입력하세요>>> ");
        String name = scanner.next();
        System.out.print("나이를 입력하세요>>> ");
        int age = scanner.nextInt();
        scanner.nextLine();//방어 효과 변수에 대입하지 않으니 사라짐
        System.out.print("주소를 입력하세요>>> ");
        String address = scanner.nextLine();
        System.out.println("");

        System.out.println("이름:"+ name);
        System.out.println("나이:"+ age);
        System.out.println("주소:"+ address);
        System.out.println("내년나이:" + (age+1));
//\n
        System.out.println("이름: " + name + "\n 주소: ");
/*
next() vs nextLine()
1. 입력단위 next 공백 이전 까지의 단어를 읽음
nextLine 줄바꿈 이전까지
2. next 다음에 nextLine를 혼합하여 쓰게 될때, next먼저 사용시에  enter키로 인하여 nextLine의 입력이
무산된다
3. 해결방안: 막는것은 enter키 흡수용 캐리어를 작성한다.
 */
    }
}
