package chapter08_classes.score_calc;

import java.util.Scanner;

public class ScoreCalcMain {
    public static void main(String[] args) {
        ScoreCalc scoreCalc = new ScoreCalc();
//        double totalScore = scoreCalc.addScores(100, 100);
//        System.out.println(totalScore);
//
//        double avgScore = scoreCalc.calculateAvg(200, 2);
//        System.out.println(avgScore);

        /*
            chapter0
         */
        while(!scoreCalc.endOfCalc){
            Scanner scanner = new Scanner(System.in);
            System.out.println("점수를 입력하세요 (종료할려면 -1입력)>>>");
            scoreCalc.score1 = scanner.nextDouble();//double 이니
            //종료시킬  if문
            if(scoreCalc.score1 == -1){
                break;
            }
            //합을 계산하기 위한 코드
            scoreCalc.totalScore = scoreCalc.addScores(scoreCalc.totalScore, scoreCalc.score1);
            //평균을 계산하는 코드
            scoreCalc.avgScore = scoreCalc.calculateAvg(scoreCalc.totalScore, scoreCalc.totalSubs);
            System.out.println("점수를 입력 시 마다 나오는 합계와 평균");
            System.out.println("입력한 점수의 합계:" + scoreCalc.totalScore);
            System.out.println("입력한 점수의 평균:"+ scoreCalc.avgScore);

            //평균계산의 과목수가 늘어나야한다
            scoreCalc.totalSubs++;

        }
        System.out.println("--최종합계평균");
        System.out.println("최종 합계:" + scoreCalc.totalScore);
        System.out.println("최종 평균:"+ scoreCalc.avgScore);
    }

}

