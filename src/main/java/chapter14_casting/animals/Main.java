package chapter14_casting.animals;
/*
    참조 자료형 캐스팅 <-> 기본 자료형
        객체 지향 캐스팅(OOP)에서 중효한 요소 중 하나

    1. 정의:
        java에서 자료형은 크게 두 가지로 구분된느데,
        1)기본 자료형:int, double, char
        2)참조 자료형: 객체를 참조하는 변수로 클래스나 인터페이스로
            생성된 객체

        참조 자료형 캐스팅은 -> 객체의 자료형을 변환하는 작업
        A a = new A();
        A a = new B();
            캐스팅의 종류
                1)업캐스팅 : 하위 클래스 타입의 객체를 상위 클래스 타입으로 변환(전의 용량의 개념과 차이가남을 알 수 있다)
                    -상속 개념 도입
                2)다운 캐스팅 : 상위 클래스 타입의 객체를 하위 클래스 타입으로 변환
            알아야 하는 사항: 연산자(+ -) instanceof
                ex) 객체명 instanceof 클래스명

            2.업캐스팅 - 암시적으로 이뤄짐 -> 알아서 바뀐다
                -> 다만 언제 알아서 바뀌었는지 개발자가 파악할 필요가 있다
            3.다운캐스팅 - 명시적으로 이뤄짐 -> 반드시 개발자가
                적절한 장소와 시간대에 사용해줘야함
            업캐스팅과 다운캐스팅의 활용
            캐스팅은 주로 다형성을 구현할 때 사용함. 상위 클래스 타입으로 객체를 처리하면서도
                특정상황에서는 하위 클래스의 고유기능을 사용 가능

            4.캐스팅의 장단점
                장점:
                    코드의 유연성: 업캐스팅을 통해 다양한 캑체를 하나의 상위 클래스 타입으로 관리 가능
                    다형성 구현: 메서드 오버라이딩과 핰께 사용하면 코드의 재활용성을 높일 수 있음

                단점:
                    다운 캐스팅의 위험성 : 잘못 다운 캐스팅을 하게 될 수가 있다
                    예를 들어 상위클래스 a와 하위 클래스 b, c가 있다고 가정할때
                    b의 객체인 b를 a로 업캐스팅한 후 , c로 다운 캐스팅을 하게 되면 문제갇 된다

                    복잡성 증가: 코드 가독성이 떨어질 수 있음 이렇게 바꿨다가 저렇게 바꿨다가 하기 때문인데
                    특히 업캐스팅의 경우 암시적으로 일어나기 때문에 어디서
                    바뀌었는지 확인 못하고 있다가 갑자기 다운 캐스팅 튀어나와서 초심자들이 코드
                    읽는게 어려울 때가 있다

                instanceof 연산자 : java에서 객체의 실제 타입을 검사하는데 사용
                (어떤 클래스의 객체인지 확인)
                -> 주로 다운 캐스팅의 안정성을 확보하기 위해 사용

                형식:
                odject instanceof ClassName -> 1+ 2로 생각

                object : 검사하려는 객체 명
                ClassName: 객체가 검사될 클래스/ 인터페이스

                return 값은 object가  classname의 인스턴스이거나 하위 클래스의 인스턴스인 경우
                true, 아니면 false


 */
public class Main {
    public static void main(String[] args) {
        //Dog 객체 생성
        Dog dog1 = new Dog();

        //메서드들을 사용
        //오버라이딩한 메서드
        dog1.makeSound();

        //고유 메서드
        dog1.fetch();

        Animal animal1 = dog1;  //업캐스팅 1번 방법
        animal1.makeSound();//강아지가 짖습니다 재정의한 게 튀어나옴
//        animal1.fetch(); 고유 메서드는 안됨
//                           타입이 animal로 선언되서 `

        System.out.println("------animal2--------");
        Animal animal2 = new Dog();
        animal2.makeSound();//강아지가 짖습니다 <-재정의된 makesound나옴
//        animal2.fetch(); 고유메서드 사용불가능

        Animal animal3 = new Animal();
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);        //true

        boolean result2 =  animal1 instanceof Dog;
        System.out.println(result2);        //true
        //: odject가 인스턴스 이거나 하위클랫의 인스턴스인 경우 true

        System.out.println("animal2 검증 부분입니다");
        boolean result3 = animal2 instanceof Animal;
        boolean result4 = animal2 instanceof Animal;
        System.out.println(result3);//true
        System.out.println(result4);//true

        System.out.println("animal3 검증 부분입니다");
        boolean result5 = animal3 instanceof Animal;
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result5);
        System.out.println(result6);//false
        //Animal animal3 = new Animal();로만 만들어서 아예 업캐스팅이 이뤄지지 않음

        System.out.println("이상 업캐스팅");
        //다운 캐스팅
        Dog dog2 = (Dog) animal2;
        /*다운 캐스팅의 경우 명시적으로 쓰여야 하기 때문에 이전에 배운 형변환 방식인 클래스명을 사용해야 합니다.
        이전까지는 double pi =- 3.24// int three = (int) pi
        와 같은 방식으로 작성했지만 이제는 클래스와 객체 단위로 생각해야한다
         */

        dog2.makeSound();
        dog2.fetch();//이저 dog의 인스턴스이기에 fetch호출 가능

//        Dog dog3 = (Dog) animal3;//다운 캐스팅 하려는중
//        dog3.makeSound();// 오류발생

        /*
            그 이유는:
                애초에 animal3를 생성할때 Animal 클래스로 만든것을 아무런 병형을 하지 않고
                강제로 다운캐스팅을 하여 메서드를 호출했기 때문입니다.

            이상과 같은 컴파일링 오류를 막기 위한 방식으로는 animal2를 생성했을 때 처럼

         */
        Animal animal4 = new Dog();
        //형태로 선언된 클래스와 호출되는 생성자가 서로 달라야만 한다

        //컴파일링 오류를 막기 위한 다운 캐스팅 방법
        System.out.println("animal4검증부분 >>>");
        if (animal4 instanceof Dog){
            Dog dog4 =(Dog) animal4;// 이상의 조건식 true라면 시작
            dog4.makeSound();
            dog4.fetch();
        }
        System.out.println("오류 생기는 animal3검증 >>>>");
        if(animal3 instanceof Dog){
            Dog dog5 =(Dog) animal3;

            dog5.makeSound();
            dog5.fetch();
        }else{
            System.out.println("다운캐스팅 불가능");
        }
    }
}
