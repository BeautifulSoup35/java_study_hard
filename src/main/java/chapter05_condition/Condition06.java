package chapter05_condition;

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        /*
        score 0보다 작고 100보다 크면 grade는 x
         */
        // S import
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = scanner.nextInt();
        int changedScore = score / 10;
        String grade = "";
        //8.8이라 안뜨고 int라 선언해 8로만 뜬다
//        System.out.println(changedScore);
        //오류 잡기 if - switcg 혼합
        if(score < 10 || score >100){
            grade = "x";
        } else if (score <5 ) {
            grade = "F";
        } else {
            //여기서 부터 switch 문
            switch (changedScore){
                case 10:
                case 9:
                    grade ="A";
//                    System.out.println("당신의 성적은 a");
                    break;
                case 8:
                    grade ="B";
                    break;
                case 7:
                    grade ="C";
//                    System.out.println("당신의 성적은 b");
                    break;
                case 6:
                    grade ="D";
                    break;

                default:
                    System.out.println("잘못입력하셨습니다");
                    grade = "Y";
            }
            if (grade != "y"){
            System.out.println("당신의 성적은" + grade +"입니다");}

            //풀이
            switch (changedScore){
                case 10:
                case 9:
                    grade ="A";
                    break;
                case 8:
                    grade ="B";
                    break;
                case 7:
                    grade ="C";
                    break;
                case 6:
                    grade ="D";
                    break;


            }
            System.out.println("당신의 성적은" + grade +"입니다");



        }









    }
}
