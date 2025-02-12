package chapter08_classes.constructor;

public class ConstructorMain {


    public static void main(String[] args) {
        //기본 생성자를 통한 인스턴스 생성
        Constructor constructor0 = new Constructor();

        //매개변수 생성자를 통한 인스턴스 생성
        Constructor constructor1 = new Constructor(38);

        // 객체인 constroctor0 의 속성에 값을 대입하는 방법

//    constructor1.name = "안근수";
        Constructor constructor2 = new Constructor("안근순");

        constructor0.name = "김일";
        constructor0.num = 10;

        Constructor constructor3 = new Constructor(21, "권민주");
        Constructor constructor4 = new Constructor(30, "김일");

        System.out.println(constructor3.name + constructor3.num);
        System.out.println(constructor0.name + constructor0.num);
        System.out.println(constructor4.name +" : "+ constructor4.num);

        constructor0.showInFo();
        constructor1.showInFo();
        constructor2.showInFo();
        constructor3.showInFo();
        constructor4.showInFo();

        System.out.println();

        System.out.println(constructor0.showInFo2());
        System.out.println(constructor1.showInFo2());
        System.out.println(constructor2.showInFo2());
        System.out.println(constructor3.showInFo2());
        System.out.println(constructor4.showInFo2());

    }


}
