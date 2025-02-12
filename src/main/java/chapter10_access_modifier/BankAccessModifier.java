package chapter10_access_modifier;
/*
     접근 지정자(Access Modifier) :
        클래스, 메서드, (필드) 변수 등에 대한 접근 권한을 제어하는 데
        사용되는 명령어
    종류 :
        1) public : 모든 클래스에서 접근 가능 -> setter / getter 자동 생성 때 public으로 만들어진 이유
        2) protected : 같은 패키지 내의 클래스 및 이 클래스를 상속 받은
            자식 클래스에서 접근 가능(상속 개념은 추후 설명 예정)
        3) default(package-private) : 접근 지정자를 명시하지 않으면
            default로 간주되며, 같은 패키지 내의 클래스에서만 접근 가능
        4) private : 같은 클래스 내에서만 접근 가능

    작성 가이드 라인
        1. BankAccessModifier
            1) 필드
                accountNumber(계좌번호, 정수)
                accountHolder(예금주 이름, 문자열)
                balance(잔액, 정수)
                pinNumber(비밀번호, 4자리 정수)

            2) 생성자
                기본 생성자
                계좌 번호만 받는 생성자
                계좌 번호와 예금주를 받는 생성자
                계좌 번호, 예금주, 초기 잔액을 받는 생성자
                계좌 번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자

            3) 메서드
                Setter / Getter
                    특히 Setter의 경우에는 유효성 검증 로직을 삽입해야 함.
                        -> 잔액은 음수일 수 없음
                        -> 비밀번호는 0000 ~ 9999까지만 가능  -> 실패하면 "불가능한 비밀번호입니다."
                입출금 메서드
                    deposit(int amount, int inputPin) -> 입금
                        - 올바른 비밀번호인지 확인
                        - 유효한 금액인지 검증(0보다 큰 값) -> 실패하면 "불가능한 입력 금액입니다."
                        - 콘솔창에
                            입금 성공! 현재 잔액 : 100000원
                    withdraw(int amount, int inputPin) -> 출금
                        - 올바른 비밀번호인지 확인
                        - 유효한 금액인지 검증(0보다 큰 값) -> 실패하면 "불가능한 입력 금액입니다."
                        - 출금 후 잔액이 0 이상인지 확인 -> 실패하면 "출금 불가입니다."
                        - 콘솔창에 출금 성공! 현재 잔액 : 40000원
                    showAccountInfo()
                        - 콘솔창에
                            안근수 님의 계좌 번호는 1234567이며, 현재 잔액은 100000원입니다.

        작성 중에 여러분 나름대로 BankAccessModifierMain에 객체 생성해보고 되는지 안되는지 다 검증할 것.
        저는 여러분들이 작성 다 끝나고 나면 객체 이런 방식으로 만들어서 특정 메서드 실행해보세요. -> 그때 통과 되는지 확인할 예정
 */
public class BankAccessModifier {
    private long accountNumber;
    private String accountHolder;
    private long balance;
    private int pinNumber;
//    private String pinNumber1;

    BankAccessModifier(){}

    public BankAccessModifier(long accountNumber) {
        this.accountNumber = accountNumber;
        System.out.println("기본생성자 생성했습니다");
    }

    public BankAccessModifier(long accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        System.out.println("계좌번호와 예금주 이름 설절 완료");

    }

    public BankAccessModifier(long accountNumber, String accountHolder, long balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        System.out.println("계좌번호와 예금주 이름 통장 금액 설정");

    }

    public BankAccessModifier(long accountNumber, String accountHolder, long balance, int pinNumber) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
        System.out.println("계좌번호와 예금주 이름, 통장잔고 비밀번호 설정 완료");

    }


    //set
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
        //음수 불가능
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setBalance(long balance) {
        if(balance <0){
            System.out.println("불가능한 입력금액입니다.");
            return;
        }
        this.balance = balance;
    }
    public void setPinNumber(int pinNumber) {
        if(pinNumber>9999 || pinNumber <0){
            System.out.println("사용 불가한 비밀번호입니다.");
            return;
        }
        else if(pinNumber ==0){

        }
        else if(pinNumber >0 || pinNumber <10){

        }
        else if(pinNumber >9 || pinNumber <100){

        }
        else if(pinNumber <99 || pinNumber <1000){

        }

        this.pinNumber = pinNumber;
    }
//    public void setPinNumber(String pinNumber) {
//        if(pinNumber.length() >4){
//            System.out.println("비밀번호의 최대수는 4자리 입니다. 다시 입력해 주세요");
//            return;
//        }
////        this.pinNumber1 = pinNumber;
////        int pinnum = (int) pinNumber;
//    } string 으로 받을때 

//get
    public long getAccountNumber() {
        return accountNumber;//get 불러지면 set의 논리가 안들어간다
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public long getBalance() {
        return balance;
    }
    public int getPinNumber() {
        return pinNumber;
    }



    void deposit(long amount, int inputPin) {
        if (inputPin != this.pinNumber) {
            System.out.println("올바른 비밀번호가 아닙니다.");
            return;
        }
        else if(amount < 0){
            System.out.println("올바른 입금 급액이 아닙니다.");
            return;
        }
        System.out.println("입금 성공! 현재잔액: " + (this.balance + amount));
        this.balance = this.balance + amount;//없을 경우 오류 생김
        //account01.withdraw(10000, 2345 );
        //        account01.deposit(10000, 2345 );
    }

    void withdraw(long amount, int inputPin){
        if(inputPin == this.pinNumber){
            if(this.balance-amount >0 ||this.balance-amount ==0 ){
                System.out.println("출금 성공! 현재잔액: " + (this.balance-amount));
                this.balance = this.balance - amount;// 대입 안할시 입금자 금액이 계속해서 초기화됨
                //오류 main  코드
                //account01.withdraw(10000, 2345 );
                //        account01.deposit(10000, 2345 );

            }
            else {
                System.out.println("잔액이 부족합니다.");
            }
        }else{
            System.out.println("올바른 비밀번호를 입력하시오");}

        //풀이 방식
//        if(inputPin == this.pinNumber && amount >0 && (this.balance - amount >= 0)){
//
//
//        }
        }

//안근수 님의 계좌 번호는 1234567이며, 현재 잔액은 100000원입니다.
    void showAccountInfo(){
        System.out.println(this.accountHolder + "님의 계좌번호는 "+ this.accountNumber+ "이며, 현재 잔액은" + this.balance+"입니다.");
    }


}
