package chapter04_scanner;

import java.util.Scanner;

public class Scanner04Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 키를 입력하세요>>");
        double height = scanner.nextDouble();
//        double height = scanner.nextDouble() / 100; 가능
        height = height / 100;
        System.out.print("당신의 몸무게를 입력하세요>>");
        int weight = scanner.nextInt();//double로
        double bmi = weight/(height*2);
        //형변환
        int bmi2 = (int) bmi;
        System.out.print("당신의 BMI지수는" + bmi2 + "입니다.");


    }
}
