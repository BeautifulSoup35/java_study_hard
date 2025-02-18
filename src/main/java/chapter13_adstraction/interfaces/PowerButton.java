package chapter13_adstraction.interfaces;

public class PowerButton extends Button{
    //필드 선언
    private boolean status;
    public String name;


    @Override
    public void onPressed() {
        if(status){ //status == ture라면 실행
            status = false;
            System.out.println("전원을 끕니다");
        }else {
            status = true;
            System.out.println("전원을 켭니다");
        }
    }
}
