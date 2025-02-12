package chapter11_arrays;
/*
    배열의 필요성:
        여태까지의 수업을 기준으로 하면 10개의 정수형 데이터를 저장하려면 int 변수를
        10개 선언해서 저장해야했다
        배열은 같은 자료형의 데이터를 하나의 변수에 저장해서 처리하는 방식입니다.
            -> 추후 다른 자료형을 하나의 변수에 저장하는 방식도 수업할 예정

        선언방식:
        자료형[] 변수명 =
        ex)
        int[] arr1 = new int[5];    //배열 선언 방식 1 -> 배열을 선언만 하고 값은 나중에 대입
        int[] arr2 = {1, 2, 3, 4, 5}; //배열선언 방식 2 -> 배열 선언 및 초기화

        [I@36baf30c at다음 주소값이 출력된다
        {1, 2, 3, 4, 5}로 출력되지 않는다는 사실 !!
        일반 변수와 참조 변수 개념
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int a =1;
        int b = 2;
        //등등등 어쩌면 z까지
        //1부터 10까지 저장하는 자료형 선언
        int[] arr1 = new int[5];    //배열 선언 방식 1 -> 배열을 선언만 하고 값은 나중에 대입
        int[] arr2 = {1, 2, 3, 4, 5}; //배열선언 방식 2 -> 배열 선언 및 초기화
        System.out.println(arr1);//[I@36baf30c
        System.out.println(arr2);//[I@7a81197d
    }
}
