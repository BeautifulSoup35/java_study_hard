package chapter13_adstraction.interfaces;

public class TemparatureUpBoutton extends Button{
    @Override
    public void onPressed() {
        System.out.println("온도를 한 칸 올립니다");
    }

    @Override
    public void onup() {
        System.out.println("온도를 계속 올립니다.");
    }
}
