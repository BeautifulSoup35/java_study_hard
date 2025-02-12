package chapter06_loops;
/*
for 반복문
1) 일반
2)향상된(enhanced for-loop)
 */
public class Loop01For {
    public static void main(String[] args) {
        /*
        for 반복문
            : 대부분의 경우레는 명확한 획수가 고정되어 있을때 사용함

        형식:
        for(시작값; 종료값; 증감값;){
            반복실행문
            }
         */
//        for (int i = 1; i< 11; i++){
//            System.out.println(i+ 1);
//        }
//        for (int i = 0; i< 10; i++){
//            System.out.println(i+ 1);//int i가 0인게 더욱 선호된다
//        }
        int sum=0;
        /*
        합 구하기
         */
        for(int i = 0; i <=100; i++){
            sum += i;
        }
        System.out.println("1부터 100까지의 합:" + sum);

    }
}
