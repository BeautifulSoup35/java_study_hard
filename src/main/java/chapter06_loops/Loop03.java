package chapter06_loops;
/*
    중첩 for문(nested for loop)
    형식:
    for(int i = 0; i<10; i++){
        실행문1
        for (int j =0; j<10; j++){
            반복실행문2
            }
            반복 실행문 3
        }
 */
public class Loop03 {
    public static void main(String[] args) {
        //변수 선언
        int a ;
        int b;

        for (int i =0; i<5; i++){
            a = i;//a의 값 초기화
            System.out.println("a의 값" + a);//반복실행문 1
            for (int j = 0; j <5; j++ ){
                b = j;//b의 값 초기화
                System.out.println("b의 값"+ b);//반복문 2
            }
            System.out.println("-----b 가 끝나서 새로 a를 대입합니다.");//반복문 3
        }
        for(int i = 2; i <10; i++){
            for(int j = 1; j < 10; j++){
                System.out.println(i + "X" + j+ "="+(j*i));
            }
//            System.out.println();
        }





    }
}
