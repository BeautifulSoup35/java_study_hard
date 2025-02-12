package chapter07_methods;

import java.util.Scanner;

/*총합점수들을 입력 받아서 총합 및 평균점수를 내는 프로그램을 구현할 예정
\main단계에서 전체를 작성하는게 아님

이제부터는 method부분과 실행 부분을 나누는 과정을 거치도록 하겠습니다.
 */
public class ScoreCalc {
    //1. 총합을 내는 메서드 : call4 유형으로 작성
    public static double addScores(double totalScore, double address){
        return totalScore + address;
    }
    public static double calculateAvg(double totalScore, int numOfSubject){
        return totalScore / numOfSubject;
    }
    //2 addScore() 메서드를 오버로딩하여 매개 변수가 3, 4, 5, 6인 메서드들을 만스에요
//    public static double addScores(double score1, double score2, double score3){
//        return score1 + score2 + score3;
//    }
//
//    public static double addScores(double score1, double score2,double score3,double score4){
//        return score1 + score2+ score3 + score4 ;
//    }
//
//    public static double addScores(double score1, double score2,double score3,double score4,double score5){
//        return score1 + score2+ score3 + score4 + score5;
//    }
//
//    public static double addScores(double score1, double score2,double score3,
//                                   double score4,double score5,double score6){
//        return score1 + score2 + score3 + score4 + score5 + score6;
//    }

    //평균을 내는 메서드를 정의 : call4() 유형으로 쓸것이다


//    public static double addScores(double ){
//        return
//    }
//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean endOfCalc = false;
        double score1 =0;
        double totalScore = 0;
        double avgScore = 0;
        int totalSubs =1;
        while(!endOfCalc){
            System.out.println("점수를 입력하세요 (종료할려면 -1입력)>>>");
            score1 = scanner.nextDouble();//double 이니
            //종료시킬  if문
            if(score1 == -1){
                break;
            }
            //합을 계산하기 위한 코드
            totalScore = addScores(totalScore, score1);
            //평균을 계산하는 코드
            avgScore = calculateAvg(totalScore, totalSubs);
            System.out.println("점수를 입력 시 마다 나오는 합계와 평균");
            System.out.println("입력한 점수의 합계:" + totalScore);
            System.out.println("입력한 점수의 평균:"+ avgScore);

            //평균계산의 과목수가 늘어나야한다
            totalSubs++;

        }
        System.out.println("--최종합계평균");
        System.out.println("최종 합계:" + totalScore);
        System.out.println("최종 평균:"+ avgScore);

////        //
////        Scanner scanner = new Scanner(System.in);
////
////        //사용할 변수 목록
////        double score1 = 0;
////        double score2 = 0;
////        double totalScore = 0;
////        int totalSubject =0;
////        double avgScore =0;
////
////        System.out.println("점수를 입력하세요>>>");
////        score1 = scanner.nextDouble();
////        System.out.println("점수를 입력하세요>>>");
////        score2 = scanner.nextDouble();
////        totalScore = score1 + score2;
////        totalSubject =2;
////        avgScore = totalScore /totalSubject;
////        System.out.println("과목 총점"+totalScore);
////        System.out.println("평균"+avgScore);
//
////        System.out.println(addScores(100, 78));
////        System.out.println(addScores(100, 78, 5, 4));
////        매번 변수 선언 초ㄱ화 대입 sout했음
//        double totalScore2 = addScores(100, 90);
//        int subs = 2;
//        //가독성을 깨지지만 여전히 개발자들이 사용한믄 방식
//        System.out.println(calculateAvg(addScores(100, 80), 2));

    }
}
