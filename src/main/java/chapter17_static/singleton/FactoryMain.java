package chapter17_static.singleton;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");

        //smartphone 잘못된예씨
//        Smartphone smartphone1 = new Smartphone("Samsung", "갤럭시 23", "2024");
//        System.out.println(smartphone1);

        //싱글톤 패턴 사용하고 -> factory 객체를 통한  smartphone 객체 생성
        Smartphone smartphone1 = factory1.produceSmartPhon();
        Smartphone smartphone2 = factory1.produceSmartPhon();
        Smartphone smartphone3 = factory1.produceSmartPhon();
        Smartphone smartphone4 = factory1.produceSmartPhon();

        System.out.println(smartphone1);
        System.out.println(smartphone2);
        System.out.println(smartphone3);
        System.out.println(smartphone4);
        //시리얼 넘버가 갱신된다
    }
}
