package chapter13_adstraction.interfaces;
/*
    인터페이스(interface)
        인터페이스는 자바에서 클래스가 구현해야는 메스드들의 집합을 정의하는 일종의 규약

        인터페이스는 메서드의 시그니처(메스드 이름, 리턴 타입, 매개변수 목록)만을
        포함하며, 메서드의 실제 구현은 포함하지 않음
            -> 추상 메서드와 유사한 점

        다중 상속을 지원-> 이를 통해 클래스가 여러 인터페이슬 구현할 수 있음
        :추상 클래스는 단일 상속을 지원너한다 상속 과정을 보기 쉽다

    튿징
        1. 추상 메서드 : 인터페이스 내의 모든 메서드는 기본적으로 추상 메서드
        2. 상수 : 인터페이스 내에서 선언된 변수는 모드 '자동으로 '
        public static final 상수로 취급됨
        3. 다중상속 : 클래스는 여러 인터페이스르 구현할 수 잇다.

    추상 클래스와의 공통점
        - 모두 추상 클래슬 포함 할 수 있고, 이를 서브 클래스에서 구현해야한다

    추상 클래스와의 차이점
        -추상 클래스
            1. 부분 구현 허용 : 추상 클랫스는 추상 메서드 뿐만 아니라 일반
                메서드도 포함할 수 있다
            2. 상태저장 가능 : 추상 클래스는 인스턴스 변수 (상태)를 가질수 잇따
            3. 단일 상속: 클래스는 하나의 추상 클래스만 상속 받을 수 잇다
            4. 생성자 : 추상 클래스는 새엇ㅇ자를 가질 수 있다.
            5. 다양한 접근제어자: 추상 클래스의 메서드와 변수는 다양한 접근 제어자를 가진다ㅣ( public, private)

        - 인터페이스
            1. 완전한 추상화 : 인터페이스는 기본적으로 모든 메서드가 추상 메서드
                java8 이후에 default, static 메서드를 사용할 수 있긴하다
            2. 인터페이스는 인스턴스 변수를 가질 상수만 선언가능
            3. 다중 상속 : 클래스는 여러 인터페이스를 구현할 수 있다
            4. 생성장 없음: 인터페이스는 생성자를 가질 수 없다
                -> 일단 필드에ㅐ서 객체마다 다른 값을 가지게 되는 인스턴스 변수가 없다 생성자 생성 불가능 객체마다 다른 값을 가질 수 업삳
            5. 자동 public : 인터페이스의 메서드들ㅇ은 자동 public이며 메서드 선언이후 접근제어자 명시할 필요없다
 */
public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController(
                new PowerButton(), new VolumeDownButton(), new VolumeUpButton());
//-> 생성자들 생성 상태 -> 객체 선언이 되었을까??의 질문
// RemoteController remoteController = new RemoteController();
        /*
            저희가 매개변수 생성자로 정의해서 오류가 발생한다
            그래서 argument들을 넣을 필요가 있는데

            RemoteController의 객체를 생성했고, 객체며ㅑㅇ이 remoteController입니다
            즉 클래스명1 객체명1 = new 클래스명1(arg1, arg2)
            근데 클래스명2 객체명2 = new 클래스명2( new 클래스명3, new 클래스명4)

            이상의 경우 new 클래스명3(), new 클래스명4()를 통해 객체 생성은 이미 완료됨
                -> 생성자의 정의 : 객체가 생성될 때 자동으로 호출되는 특별한 메서듣
                다만 객체명이 없다
         */
        int [] arr1 = {1, 2, 3};
//        System.out.println(remoteController.powerButton);//@5305068a

//        powerbutten 객체명 안해서 없음

        remoteController.onPressedPowerButton();//전원을 켭니다

        remoteController.onPressedVolumeUpButton();//음량을 계속 올립니다
        remoteController.onPressedVolumeDownButton();//음량을 계속 내립니다

        remoteController.onDownVolumeDownButton();//음량을 한 칸 내립니다.
        remoteController.onUpVolumeDownButton();//음량을 한 칸 올립니다.
        //remote 타고 들어가야함 // 현재 이중 호출
        /*
            다중상속을 지원하지 않는 Java클래스에서 remoteController하는 객체가
            powerButton /VU/VD 에 있는 메서드 총 5개를 전부 호출 할 수 있는방법
            필드로 클래스들을 가지고 시작한다, 생성자의 arg로 사용한다음
            remotecontroller의 일반 메서드로 pb의 메서드 호출을 할 수 있도록 정의함

            그리고 main에서 "remoteController.onPressedPowerButton"로 호출하면
            onPressedPowerButton얘가 powerButton.onPressed();를 다시 호출해서 전체 기능 구현
         */






    }
}
