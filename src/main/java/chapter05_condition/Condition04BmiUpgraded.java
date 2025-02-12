package chapter05_condition;

import java.util.Scanner;

public class Condition04BmiUpgraded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String say = "에이";
        System.out.print("당신의 키를 입력하세요>>");
        double height = scanner.nextDouble();
//        double height = scanner.nextDouble() / 100; 가능
        height = height / 100;
        System.out.print("당신의 몸무게를 입력하세요>>");
        int weight = scanner.nextInt();//double로
        double bmi = weight/(height*2);
        //형변환
        int bmi2 = (int) bmi;
//        System.out.print("당신의 BMI지수는" + bmi2 + "입니다.");

        //18 초과 정상 23초과 과체중 25 초과 비만
        if(bmi < 0){
//            say = "오류";
            System.out.println("잘못입력하셨습니다.");
        }
        else if(bmi<=23){
            say ="정상체중";
        }else if(bmi <=25){
            say ="과체중";
        }else{
            say ="비만";

        }


        System.out.println("당신의 bmi지수는 "+bmi2+"으로 나왔습니다 "+ say+"입니다");
    //bmi가 음수가 돼서 say에 아무런 값을 대입하지 못해도  실행된다는 점


    }
}
