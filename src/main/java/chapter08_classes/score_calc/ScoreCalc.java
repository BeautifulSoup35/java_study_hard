package chapter08_classes.score_calc;

public class ScoreCalc {

    boolean endOfCalc = false;
    double score1 =0;
    double totalScore = 0;
    double avgScore = 0;
    int totalSubs =1;
        //1. 총합을 내는 메서드 : call4 유형으로 작성
        public static double addScores(double totalScore, double address){
            return totalScore + address;
        }

    public static double calculateAvg(double totalScore, int numOfSubject) {
        return totalScore / numOfSubject;
    }
}
