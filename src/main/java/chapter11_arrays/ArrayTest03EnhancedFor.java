package chapter11_arrays;

public class ArrayTest03EnhancedFor {
    //형식 :
    //        for( 자료형 변수명 : 반복가능객체(배열) ) {
    //            실행문
    //        }

    /*
    향상된 for문(Enhanced for loop)

    일반 for 문과의 차이점 :
        일반 for문의 경우 인덱스 넘버를 명확하게 알고 있어야 하지만
        일일이 element의 숫자를 세는 것이 번거롭기 때문에
        arr01.length와 같은 방식으로 int 값을 추출해서 대입했었습니다.

        그런데 잘 생각해보면 for (int i ...) 할 때의 int i는
        for 문 내부에서 선언됩니다.

        이를 응용하여 배열 내의 element를 변수에 대입해버리는 방식으로
        index 넘버의 사용 없이 적용할 수 있는 for 반복문에 해당

    제약 :
        읽기만 되고, 쓰기가 안됩니다.

    형식 :
        for( 자료형 변수명 : 반복가능객체(배열) ) {
            실행문
        }
 */
}
