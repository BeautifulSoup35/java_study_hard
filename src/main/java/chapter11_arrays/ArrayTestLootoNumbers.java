package chapter11_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTestLootoNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int totalGame = 5;

        int[] lottoNumbers = new int[6];
        boolean duplicate;
//임시 변수 하나 선언
        int number;
        for (int j = 0; j < 5; j++) {//게임 전체 반복을 돌리는 반복문
            for (int i = 0; i < lottoNumbers.length; i++) {//난수를 생성해서 대입하는 반복문
                duplicate = false; //초기화 -> 직전 반복에서  true가 되었을때 계속 해서 돈다
                number = random.nextInt(45) + 1;//난수 대입
                //여기서 부터 반복을 돌린다
                for (int k = 0; k < i; k++) {
                    if (lottoNumbers[k] == number) {//배열에 있는 숫자가
                        //방금 막 대입한 number와 겹친다면
                        duplicate = true;//위의 boolean 변수가 true가 되었다면 -> 한 번더 난수 대입을 해야 합니다.
                    }
                    if (!duplicate) {
                        //겹치는 변수가 없었다면
                        lottoNumbers[i] = number;
                    } else {
                        //중복이 있다면
                        i--;    //반복횟수를 한 번 까서 한 번더 난수 대입이 되게 한다
                    }
                    //완전히 확정 짓기전 중복체크
                }
                Arrays.sort(lottoNumbers);
                System.out.println(Arrays.toString(lottoNumbers));
            }
        }




    }
}