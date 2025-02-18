package chapter13_adstraction.interfaces;

public interface Press {
    String NAME = "button";
    //interface  여서 접근 제어잘 명시 안했지만
    //public final 생략되있음
    //기본 상수이기에 대문자로 표기
    //일반적 클래스 경우 String name; 마무리가 아니라
    // 초기화까지 해야함 -> final 특징

    //안되는 것들 예시
//    private String name;    //접근 제어자 지정 불가능하다
//    String name;// 선언만 하는것도 불가능
//    public Press();//생성자 선언 불가능
//    void pop(){
//        System.out.println("일반 메서드");
//    }//구현부 가지지 못함 void앞에 default쓰면 가능
    //구현부 있는 일반 메서드가 되는 것처럼 나온 부분 -> java8
    //업데이트 된 내용이고ㅓ default 경우 동일 패키지 내에서는'
    //chapter10_access_modifier에서 수업한 내용

    // 되는것 정의 -> 추상 메서드 정의
    void onPressed();

    //interface
}


