package chapter17_static.singleton;

import lombok.AllArgsConstructor;

/*
    싱글톤 패턴 (singleton pattern)
        :  소프트웨어 디자인 패턴 중 하나로 어떤 클래스가 하나의 인스턴스만 갖도록 보장하고,
        그 인스턴스에 접근할 수 있는 전역적인 접근법을 제공하는 패턴,
        예를 듫ㅇ어, 데이터베이스 연결과 같은 리소스는 프로그램 전체에서 하나의 인스턴스만\
        사용해야 할 때가 많기 때문에 싱글톤 패턴은 유용함

    특징:
        1. 하나의 인스턴스만 존재 : 하나의 인스턴스만 생성되고, 이 인스턴스는
            프로그램이 실행되는 동안 유지.
        2. 전역접근법 : 싱글톤 인스턴스는 정적 메서드를 통하여
            어디서든 접근할 수 있음.
        3. 인스턴스의 생명 주기 관리 : 클래스 자체가 인스턴스 생성을 관리하므로,
        다른 객체들이 직접 인스턴스 생성하거나 폐기할수없음

    장점:
        1, 메모리절약: 불필요한 인스턴스 생성를방지하여 메모리 절약 가능
        2/ 글로벌 접근: 전역적으로 접근할 수 있어 메모리 관리가 용이
        -> 하지만 잦은 버근 자체는 단점에 해당함.
        3. 일관성 유지 : 애플리케이션 전반에서 라나의 인스턴스만 사용하기 때문에 상태 일관성을 유지.

    단점:
        기사 기능사

    우리는 현제 객체를 person1 2, 3, 이렇게 했지만
    이제는 객체가 하나만 생성가능하도록 강제한다ㅓ
    -> 특정 로직 작성하는 방법 모색
    ->딴 객체 만들었지만 첫 객체를 끌고오는것 이런 로직으로 만든다
 */
@AllArgsConstructor
public class Factory {
    private String factoryName;

    //메서드 정의,
    public Smartphone produceSmartPhon() {
        System.out.println(factoryName + "에서 스마트폰을 생성합니다");
        String model = "갤럭시s26";
        String serial = null;
        Samsung samsung = Samsung.getInstance();    //생성자가 아니라 method를 통해서
                                                    // samsung 객체 생성 -> 메서드를 통해서 불러내는 방식
        //이상의 코드는 생성자가 아니라 method를 통해서 생성했는데ㅐ, getInstance 메서드의
        //코드라인을 확인해 보면 samsung 객체가 없다면 새로 생성하고
        //ㅁ이미 존재하는 객체가 잇다면 기족 객체를 반환함. 전체 객체 생성횟수 : 1로 고정

        serial = samsung.createrSerialNumber(model);
        Smartphone smartphone = new Smartphone(samsung.getCompany(), model, serial);
        return smartphone;
    }

}
