package chapter14_casting.centralcontrol;

public class LED implements Power {
    @Override
    public void on() {

    }

    @Override
    public void off() {
    }
    public void changeColor(){
        System.out.println("led색깔을 바꿉니다.");
    }
}
