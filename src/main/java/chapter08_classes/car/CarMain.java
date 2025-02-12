package chapter08_classes.car;

public class CarMain {
    public static void main(String[] args) {

        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.color = "빨강";
        System.out.println(myCar.color);
        myCar.speed = 100;
        System.out.println(myCar.speed);
        myCar.drive();

        yourCar.color = "노랑";
        System.out.println(yourCar.color);
        yourCar.speed = 140;
        System.out.println(yourCar.speed);
        yourCar.stop();

        //풀이
        myCar.color = "빨강";
        yourCar.color = "노랑";
        myCar.speed = 100;
        yourCar.speed = 140;


        System.out.println(myCar.color);
        System.out.println(yourCar.color);
        System.out.println(myCar.speed);
        System.out.println(yourCar.speed);

        myCar.drive();
        yourCar.stop();


    }
}
