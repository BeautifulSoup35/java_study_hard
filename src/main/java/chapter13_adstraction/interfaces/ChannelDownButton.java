package chapter13_adstraction.interfaces;

public class ChannelDownButton extends Button {
    //생산자
    @Override
    public void onPressed() {
        System.out.println("채널을 한 번 내립니다.");
    }

    @Override
    public void ondown() {
//        super.ondown();
        System.out.println("채널을 계속 내립니다");
    }
}
