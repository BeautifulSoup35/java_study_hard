package chapter13_adstraction.abstract_class;

public class PhoneFactory extends Factory {
    // 빨간거 떠서 누른 결과 2개가 생성됨
    //생성자 넣기
    public PhoneFactory(String name) {
        super(name);
    }
        // factory 클래스에 있던 추상 메서드인 produce 를 override 하니까 구현부
    //PhoneFactroy 클래스에서 추상 메서드를 구현부가 있는 메서드로 재정의해서 사용
    @Override//메서드 넣기
    public void produce(String model) {
        System.out.println("["+ model + "] 모델 스마트폰을 생성합니다");
    }
//추상클래스를 상속받으면 무조건 가져야하는 클래스들이 존재한다 // 구현을 강제한다
    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
