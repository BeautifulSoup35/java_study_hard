package chapter11_arrays;

import java.util.Random;
import java.util.Scanner;

//배열 전체를 출력하는 방법은 이제 수업에서 배우게 됩니다.
public class ArrayTest04 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println(num);
        System.out.print("임의의 숫자를 입력하세요 >>> ");
        int num2 = scanner.nextInt();
        System.out.println(num2);

//        System.out.println(Arrays.toString(arr01));
        //(Arrays.toString(arr01)
    }
}
