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

 */
@Setter
@Getter
public class UserEntityLombok {
    private int username;
    private int password;
    private String email;
    private String name;
}
