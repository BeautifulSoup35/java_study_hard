package chapter13_adstraction.interfaces;
/*
    인터페이스는 일반 클래스왇 ㅏㄹ리 다중 상속이 가능'
    그렇기 때문에 일반 클래스와 상속 관련 명령어도 다름
    extends(일반 클래스 상속 시)
    inplements(인터페이스 상속 시)

    객체를 3인치 단수로 본
 *///추상메서드로 선언
public abstract class Button implements Press, Up, Down {

    @Override
    public void ondown() {
    }

    @Override
    public abstract void onPressed();

    @Override
    public void onup() {
    }
}
    //alt ins로 가지고온 우리가 선택해 가지고 온
//        public abstract void ondown();
//}
/*
    PowerButton에서 확인할 수 있듯
    전원을 켜고 끄기만 하면 되는 상황
    onUp 메서드와ㅓ onDown 메서드를 굳이 Override할 필요가 없습니다/
    하지만 abstract로 선언한 메서드는 반드시 자식 클래스에서
    구현되어야 하므로
    onup, ondown 메서드들은 avstract로 선언하면
    powerbutton 클래스에 불필요한 method들을 구현해야 하므로
    onPressed만 adstract로 선언함
 */
