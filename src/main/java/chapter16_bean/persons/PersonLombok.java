package chapter16_bean.persons;

import lombok.*;

@Getter
//@ToString
@Data// 데이터 내에 있는 있는 tostirng
@AllArgsConstructor
@RequiredArgsConstructor
public class PersonLombok {
    private final String name;
    private int age;

    @Override
    public String toString() {
        return "이름: "+name+ "\n나이: " + age;
    }
    /*
    @Data 사용했을경우
    @tostring이 포함돼있긴 하지만
    여러분들이 코드 하단에 tostring()을  override 받아 재정의했을경우
    재정의한  tostring이 우선적 사용
     */

    /* answer
        lombok 애너테이션을 사용하여 생성자 getter setter를 만든다
        personmain으로 가서
        personlombok으로 클래스의 객체 person2를 생성하고
        이름 - 여러분 이름 나이
     */
}
