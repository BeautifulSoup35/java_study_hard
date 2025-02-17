package chapter12_inheritance;
/*
    상속(inheritance)란?
        : 객체 지향 프로그래밍(oop: odject oriented programming)의 핵심 개념
        기존 클래스(부모(슈퍼)클래스의) 속성과 메서드를 재사용하여 새로운 클래스를 만드는것을 의미

    1. 상속의 필요성
        :상속을 통해 공통적인 기능을 부모 클래스에 정의하고, 이를 여러 자식 클래스가 재사용 가능
        동물 클래스, 이를 상속 받는 개, 고양이를 자어
        동물의 공통적인 속성(이름, 나이) 행동(걷기 먹기) 부모 클래스에 정의
        그외 고유한 특정을 추가할 수 있음

        위의 과정을 거쳤을때 얻을 수 있는 이점 : 중복된 코드를 작성하지 않아도 됨

        이전에는 dog클래스에 이름, 나이라는 필드 선언, 걷기, 먹기 메서드 정의후
        또 cat에 같은 행동을 반복했다면
        이젠 줄일수 잇따

    2. 상속의 특징
        1)단일 상속: 자바는 단일 상속만 지원함 하나의 클래슨 한번에 하나의 부모 클래스만 상속 받을 수 있어 상속 구조가 간단 명확
        2)super 키워드 : 클래스의 생성자에서 setter this비슷 개념
            부모 클래스의 필드에 접근 부모 클래스의 생성자를 ㅎ로출할때 사용
        3) method override: 자식이 기본 동작을 재정의 할 수 있음 부모 클래스의 기본 동작을 자신만의 방식으로 변경 가능
        4) final키워드: 클래스 메서드에서 final 사용하면 상속이 제한됨
            final 클래스: 상속 자체가 불가능
            final 메섣, :오버 라이딩 불가능

        3/ 상속의 장점
            코드 재사용성
            유지 보수 용이성 :
            객체 간 관계표현 IS-A 관계 명확히 나타냄
            개는 동물의 일종이다 로 정의 가능 자식을 보니 부모가 유추된다


 */
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();//기본
        Animal animal2 = new Animal("바둑이");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("나비", 2);

        //이상의 코드가 여태 우리가 해온 방식
        //예를 들어 Dog cat 클랫 정의할때 추가로
        //매번 필드/ 생성자/ setter/ getter 고유 메서드을
        //추가 작성해야함 -> 해결방안 inheritance상속

        Tiger tiger1 =new Tiger("티거", 4);
        tiger1.move();//움직입니다.//부모의 것
        tiger1.hunt();//호랑이가 사냥을 합니다// 자식 고유의것

        Human human1 = new Human();
        human1.setAnimalAge(20);
        human1.setAnimalName("권민주");
        System.out.println("제 이름은 "+ human1.getAnimalName()+"이고, 나이는 "+human1.getAnimalAge()+"살 입니다");
        human1.move();
        human1.read("멘토 자바");
        System.out.println(human1.read1());

    }
}
