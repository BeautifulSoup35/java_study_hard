package chapter06_loops;

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =0;
        boolean isEmpty = false;

        //while 내부가 자료형이 boolean이기만 하면 됩니다
        while(!isEmpty){//not의 의미
            System.out.print("n에 들어갈 값을 입력하세요>>");
            n = scanner.nextInt();

            if( n == 0){
                isEmpty = true;//재대입
                break;
            }
            System.out.println("n의값 : " +n);
        }
        /*
            이상의while 반복문에서 확인할수있는점:
            break; 명령어와 isEmpty 변수모두 중단시킨다는 공통점이 있다

            1) break가 실행된다면
                while문 즉시 종료 만나면 종료
            2) isEmpty가 실행되면 true->false로 중간에 바뀌어도 코드가 전체 돌아가고 멈춘다
         */


    }
}
