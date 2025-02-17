package chapter13_adstraction.abstract_class;
/*
    abstract : 추상적인

    추상 클래스
    1. 추상 메서드가 하나라도 포함되면 해당 클래스는 추상 클래스로 정의돼야 함.
    2. 추상 클래스는 객체를 생성할 수 없습니다 -> 일반 클래스와의 차이점
    3. 그 외의 다른 특징은 일반 클래스와 동일함
    4. 상속을 전제로 하는 클래스

    추상 클래스 : 추상 메서드가 하나 이상인 클래스
    추상 메서드 : 선언만 있고, 구현은 없는 메서드

    추상 클래스의 장점 :
        코드의 재사용성을 높이고 설계를 보다 명확하게 할 수 있도록 도와준다.

    추상 클래스의 목적 :
        1. 공통된 기능 제공 : 여러 클래스에서 공통적으로 사용하는 기능을 추상
            클래스에서 정의 가능
        2. 구체적인 구현 강제 : 추상 메서드를 통해 자식(서브) 클래스가 반드시
            특정 메서드를 구현하도록 강제할 수 있음.
        3. 코드의 재사용성 : 중복되는 코드를 줄이고, 유지 보수성을 높일 수 있다.

    추상 클래스에서 주의할 점 :
        - 추상 클래스는 객체를 생성할 수 없다.

    super 키워드 - 슈퍼 클래스의 멤버 및 메서드에 접근하기 위해서 사용
        1. super(매개변수) -> 서브 클래스에서 슈퍼 클래스로 생성자를 호출할 때 사용
        2. super.메서드명() -> 서브 클래스에서 슈퍼 클래스로 메서드를 호출할 때 사용

    생성할 클래스 목록
        Factory.java
        PhoneFactory.java
        TabletFactory.java
 */
public class Main {
}
