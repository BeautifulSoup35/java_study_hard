package chapter13_adstraction.interfaces;

public class TemparatureDownBoutton extends Button{
    @Override
    public void onPressed() {
        System.out.println("온도를 한 칸 내립니다.");
    }

    @Override
    public void ondown() {
//        super.ondown();
        System.out.println("온도를 계속 내립니다.");
    }

}
