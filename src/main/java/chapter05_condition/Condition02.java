package chapter05_condition;

import java.util.Scanner;

/*
    3.if else if else: elif별도의 조건식 도입
    else if (조건식2){
    }
    else if (조건식3){
    }
    else
 */
public class Condition02 {
    public static void main(String[] args) {
        //1. Scanner 클래스
        Scanner scanner = new Scanner(System.in);

        int point = 0;
        final int VIP = 80;
        final int GOLD = 60;
        final int SILVER = 40;
        final int BRONZE = 20;
        //int point = scanner.nextInt()
        System.out.print("회원 포인트를 입력하세요>>");
        point = scanner.nextInt();
        if (point > VIP){
            System.out.println("회원등급: VIP");
        }
        else if (point > GOLD){
            System.out.println("회원등급: GOLD");
        }
        else if (point > SILVER){
            System.out.println("회원등급: SILVER");
        }
        else if (point > BRONZE){
            System.out.println("회원등급: BRONZE");
        }
        /*
            이전까지
            Scanner scanner = new Scanner(System.in);
            point = scanner.nextInt();

            int point = scanner.nextInt()

            로 처음 사용될때 선언 및 초기화를 했었다.
            그런데 왜 이번에는 선언후 재대입인가
            가독성의 차이점: 변수를 위에서 선언를 해둬 분리해뒀다는것
         */





















    }
}
