package chapter05_condition;
/*
    조건문
    1.if: ()내에 조건 작성 {}내용실행 작성
    ex) if(조건식){
        실행문
    2. if else문  ()조건식이 참일때 실행문 실행 거짓일떼 else실행
    ex) else에는 조건식이 없다
        if(조건식){실행문}
        else{실행문}
    }
 */
public class Condition01 {
    public static void main(String[] args) {
        int num = -10;
        //1. if문 설명
//        if (num >0){
//            System.out.println("num은 양수입니다");
//
//        }
        //if else
        if (num >0){
            System.out.println("num은 양수입니다");}
        else{
            System.out.println("음수 or 0");
        }
    }
}
