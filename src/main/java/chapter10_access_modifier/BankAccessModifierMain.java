package chapter10_access_modifier;

public class BankAccessModifierMain {
    public static void main(String[] args) {
        BankAccessModifier account01 = new BankAccessModifier(1234567,"안근수",10000,0000 );
        BankAccessModifier account02 = new BankAccessModifier(2345678, "안녕" );

        System.out.println(account01.getPinNumber());

        account02.setBalance(10000000000L); //long임을 명시하기 위해 l표시
        account02.setPinNumber(0002);
//        account01.withdraw(10000, "0000" );
        account01.deposit(10000, 234567 );


        account01.showAccountInfo();
        account02.showAccountInfo();
//setPinNumber 확인
        account01.setPinNumber(987654);

        System.out.println(account01.getPinNumber());
        //setBalance() 확인
    }
}
