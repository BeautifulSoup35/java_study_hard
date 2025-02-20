package chapter14_casting.centralcontrol;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("전원이 켜졌습니다");
    }

    @Override
    public void off() {
        System.out.println("전원이 꺼졌습니다");
    }
    //다운캐스팅 특정 클래스의 고유 메서드 실행
    public void compute(){
        System.out.println("컴퓨터에서 계산을 실행합니다.");
    }
}
