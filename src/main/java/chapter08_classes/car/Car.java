package chapter08_classes.car;
//ClassA에 적은 내용을 바탕
public class Car {
    //필드 속성
    String color;
    int speed;

    //메서드
    void drive(){
        System.out.println(color + "자동차가 "+ speed + "km/h 주행중");
    }

    void stop(){
        System.out.println(color+"자동차가 멈췄습니다");
    }
}
