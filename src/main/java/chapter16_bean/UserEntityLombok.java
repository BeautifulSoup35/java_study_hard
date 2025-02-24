package chapter16_bean;

import lombok.Getter;
import lombok.Setter;

/*
    ctrl + alt + s//설정창 들어가기

    Lombok설치 과정
    좌측 부분 스크롤 해서 plugin에서 lombok설치
    enabled되게끔하게 -> 시각적으로 disable보이게

    크롬에서 mvn애서 maven repository가 나오는데 거기 lombok 검색
    build system(buuld.gradle)에 맞게 버전 선택 의존성 추가
    gradle 복붇 ->dependencie 아래에 바로

    build.gradle에 의존성 부분에 추가하고 나서
    maven경우에 pom.xml dependencie에 추가하고 나서
    -> 코끼리 새로고침 해야합니다.

    20250224 수업 예정 내용 -> 그래서 롬복은 어디다가 왜 쓴느거고 어떤 기능이 있는가


lomdok
Jva에서 반복적으로 작성해야하는 코드를 자동으로 생성해주는 라이브러리
장점:
    코드의 가독성을 높일 수 있다 -> 주석을 통한 애너테이션을 붙여 코드 생성을 제어 가능
    특ㅎ히 스크롤링해서 특정 필드의 SETTER가 있는지 없는지에 대해 고려할 팰요 없이
    @ 파트만 보더라도 대략적인 코드의 흐름을 알 수 있음

    1.DATA
    Getter Setter RequiredArgusCondsturctor Tostring
    애너테이션을 전부 표함함 종합 패키지에 해당
    2 NonArguscinstrubnctir
    -기본생산저 생성
    3. required args constructor
    getter setter
    각 필드 생성
    클래스 레벌에 사용함 모든 필드에 대해 필드 레벨에 사용하면 특정피르뎅 대해 생성됨

    equalandhashcode
     equals hashcode 메서드글을 자동으로 생성 둘이 세트로 만들어줘야하기 때문이 묶여있음

     tostring
     tostring메서드들을 자동으로 생성
     객체에 필드 값을 문자열로 표현해준 메서드

     allargs constructor
        모든 필드에 포함하는 매개변수 생성자 생성
 */
@Setter
@Getter
public class UserEntityLombok {
    private int username;
    private int password;
    private String email;
    private String name;
}
