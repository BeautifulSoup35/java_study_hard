package chapter13_adstraction.interfaces;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketTimeoutException;

public class VolumeDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("음량을 한 번 내립니다.");
    }
//alt ins로 가지고온 우리가 선택해 가지고 온
    @Override
    public void ondown() {
        super.ondown();     //슈퍼 클래스의 메서드를 호출하는 키워드였습니다.
        System.out.println("음량을 계속 내립니다");
    }
//
//    @Override
//    public void onup() {
//        super.onup();
//        System.out.println("음량을 계속 올립니다.");
//    }
}
