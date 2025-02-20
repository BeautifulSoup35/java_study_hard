package chapter14_casting.centralcontrol;

public class Tv implements Power{
    @Override
    public void on() {
        System.out.println("전원이 켜졌습니다");

    }

    @Override
    public void off() {
        System.out.println("전원이 꺼졌습니다");

    }

    public void changeChanal(){
        System.out.println("채널을 변경합니다.");
    }
}
