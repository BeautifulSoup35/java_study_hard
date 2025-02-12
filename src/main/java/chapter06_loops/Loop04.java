package chapter06_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
            별찍기를 통한 for 문 구조 학습
            *
            **
            i값이 바뀔때마다  enter이 이뤄져야함
         */
//별이 5줄 찍히는 예시
//        for(int i = 0; i< 5; i++){
////            System.out.println();
//            for(int j =0; j< i+1; j++){
//                System.out.print("*");
//
//            }System.out.println();
//
//        }
        /*
            숫자를 입력받아 그 줄 수 만큼의 별찍기가 이뤄질수 있도록
         */
//        Scanner scanner = new Scanner(System.in);
//        int row = 0;
//        System.out.println("숫자를 입력하세요>>>");
//        row = scanner.nextInt();
//        for(int i =0; i < row; i++){//몇 줄짜리를 만들지
//            for(int j =0; j< i+1; j++){//별이 어떻게 찍히는가
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i =0; i < row; i++){
//            System.out.print("*");
//            for(int j =0; j< row; j++){
//
//            }
//            System.out.println();
//        }
        /*
         *****
         ****
         ***
         */
//       for(int i= 5; i>0; i--){
//           for(int j = 0; j < i; j++){
//               System.out.print("😁");
//           }
//           System.out.println();
//       }
//        for(int i= 0; i<5; i++){
//            for(int j = 0; j > i; j--){
//                System.out.print("😁");
//            }
//            System.out.println();
//        }
        int a = -1;
        for (int i = (3 + 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            a += 1;
//            System.out.println("*");
            for (int k = 0; k < a; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--풀이--");

        for (int i = 0; i < 3; i++) {
            //#1 j-- 방식을 사용한 방법
//            for (int j = 0; j > i+1; j--) {
//                System.out.print(" ");
//            }
            //#2 j++를 사용한 방법
//            for (int j = 0; j <3-(i+1); j++) {
//                System.out.print(" ");
//            }

            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }











    }
}
