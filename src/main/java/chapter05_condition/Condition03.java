package chapter05_condition;

import java.util.Scanner;

/*
     사용자에게 score 입력 받아 다음과 같은 을 만족
 */
public class Condition03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score =0;
        String grade;

        System.out.print("점수를 입력하세요>>");
        score = scanner.nextInt();
        //조건문 처리
//        if(100>score >= 90){
//            System.out.println("입력한 점수는"+score+"학점은 A 학점 입니다.");
//        }
//        else if(90 >score >= 80){
//            System.out.println("입력한 점수는"+score+"학점은 B 학점 입니다.");
//        }
//        else if(score > 90){
//            System.out.println("입력한 점수는"+score+"학점은 C 학점 입니다.");
//        }
        grade ="x";
        if(score <0 || score >100){
            System.out.println("입력한 점수는"+score+"학점은 x 학점 입니다.");//kic
        }else {
            if(score >89){
                grade ="A";
            }else if(score >79){
                grade ="B";
            }//이하 반복 생략
        }
        System.out.println("입력한 점수는"+score+"학점은"+ grade+" 학점 입니다.");
        //벗어나는 경우가 없도록 작성한다 그럼 어떻게 되는 결과가 나오는 간결한 코드가 된다
        // grade변수 사용 하는 방법
    }
}
