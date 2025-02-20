package chapter14_casting.centralcontrol;

public class CentralControl {
    private Computer computer;
    private LED led;
    private Power[] deviceArry;
    private Speaker speaker;

    public CentralControl(Power[] deviceArry) {
        this.deviceArry = deviceArry;
    }

    public int checkEmpty() {   //비어있는 배열의 index번호를 반환하도록
        //배열 내부를 탐색하여 비어있는 '첫번째' 인덱스를 리턴할 예정
        //인덱스 넘버를 뽑아 내야하기 때문에 향상된 랙 문으로 는 좀 어렵다
        for (int i = 0; i < deviceArry.length; i++) {
            if (deviceArry[i] == null) {
                return i;
            }
        }
        return -1;
        //자바의 인덱스 넘버에는 음수값이 없기 때문에 python에서는 마이너스인덱스 개념이 있습니다.
//       실패 할때 -1나타내는 경우가 많아요 . 근데 0과 가까워 -100같이 아예 나오지 않을 리턴값이 지정할수있음
    }
    public void addDevicd(Power device) {
        int emptyIndex = checkEmpty();      //비어있는 번호
        //추가적 메서드 구현 필요한 분
        //그래서 checkEmpty()먼저 쓰고 정의해 본다
        if (emptyIndex == -1) { //비어있는 곳이 없다
            System.out.println("더이상 장치를 연결할 수 없습니다");
            return;
        }
        deviceArry[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        //객체명. getClass() 패키즈 명을 포함한 클ㄹ새ㅡ명
    }



    //이상의 코드 라인들은 Power의 implements를 받은 클래스의 객체들을 배열에 집어넣는 과정입니다.
    //왜 집어 넣었는가 -> 배열 내를 반복문 돌려 각 power[]의 서브 객체들의 공통된 overriding된 메서드들을
    //전부 한 번에 실행시키기 위하여.

    public void powerOn() {
        //배열 내부에 있는 요소들(객체들 -> power의 서브 클래스들의 인스턴스)의 공통적인 메섣,(오버라이딩된 메서드
        //.on()을 실행시킬 예정

        //문제점:
        //배열의 특정 인덱스 내에 아무런 객체가 없는 상황이라면 .on()을 실행시켰을때,
        //컴파일링 에러가 발생할 확률이 있으므로, 이를 고려한

//        for (int i = 0; i < deviceArry.length; i++) {
//            if (deviceArry[i] == null) {
//                System.out.println((i+1)+": 해당 부분은 비어있습니다");
//                continue;
//            } deviceArry[i].on();

//            }//향상된 for문
//        자료형 변수명 : 반복가능객체(배열)
        //->
        for (Power device : deviceArry) {
            if (device == null) {
                continue;
            }
            device.on();

        }

        //poweroff() 메서드를 정의하시오 일반 for 향상된 for
}
    public void poweroff(){
        for (Power device : deviceArry) {
            if (device == null) {
                continue;
            }
            device.off();
        }

    }

    //  o배열 내부를 돌면서 고유 메ㅐ서드들을 호출한다
    public void performSpecificMethod(){
        for(Power device : deviceArry){
            //deviceArray 내부의 요소들은 기본적으로 Power 인터페이스의 멧거드들을
            //구현받은 클래스들의 인스턴스가 될겁니다.
            //그래서 해당 power의 서브 객체들이 특정 클래스에 해당한다면 그 객첵의 고유 매서드를
            //실행시키겠습니다
            if(device instanceof Computer){
                Computer computer = (Computer) device;// 이 코드가 실행된다면 decixce는 Computer
                //클랫의 객체라는 의미이므로 다운캐스팅 간으
                computer.compute();
            }else if(device instanceof LED){
                LED led = (LED) device;
                led.changeColor();
            }else if(device instanceof  Mouse){
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            }else if (device instanceof Speaker){
                Speaker speaker = (Speaker) device;
                speaker.changeEqula();
            } else if (device instanceof  Tv) {
                Tv tv = (Tv) device;
                tv.changeChanal();
            }
        }
    }

    public Power[] getDeviceArry() {
        return deviceArry;
    }

    public void displayInfo(){
        int i =1;
        System.out.println("현재연결된 장치 목록 : ");
        for(Power device : deviceArry){
            if(device == null){
                System.out.println("슬롯 ["+ i+ "]번 비어있음");
                continue;
            }
            System.out.println("슬롯 ["+ i+ "]번 "+ device.getClass().getSimpleName());
            i++;
        }

    }
}
