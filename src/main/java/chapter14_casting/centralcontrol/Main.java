package chapter14_casting.centralcontrol;

import java.util.Arrays;

/*
    수업예정
    CentralControl 파일
    Computer
    LED

 */
public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Speaker speaker1 = new Speaker();
        Mouse mouse1 = new Mouse();
        Tv tv1 = new Tv();
        CentralControl centralControl = new CentralControl(new Power[5]);//0번이랑 1번 밖에 없는 인덱스

        //deciceArry가 private임
        centralControl.powerOn();
        System.out.println();

        centralControl.addDevicd(computer1);
        centralControl.addDevicd(led1);
        centralControl.addDevicd(speaker1);
        centralControl.addDevicd(mouse1);
        centralControl.addDevicd(tv1);

        System.out.println();
        centralControl.performSpecificMethod();

        System.out.println();
        centralControl.poweroff();

        System.out.println(centralControl.getDeviceArry());//CentralControl@5674cd4d
        for (Power number : centralControl.getDeviceArry()) {
            System.out.print(number + " ");//centralcontrol.Mouse@6b884d57마우스의 객체임을 나타내며 프린트된다
        }
//        System.out.println(Arrays.toString(centralControl.getDeviceArry()));//centralcontrol.Mouse@6b884d57동일
        centralControl.displayInfo();// 결과->
//슬롯 [1]번 Computer
//슬롯 [2]번 LED
//슬롯 [3]번 Speaker
//슬롯 [4]번 Mouse
//슬롯 [5]번 Tv


    }
}


