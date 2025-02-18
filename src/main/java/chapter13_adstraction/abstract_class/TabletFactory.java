package chapter13_adstraction.abstract_class;
//
public class TabletFactory extends Factory{

    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[ "+model+" ] 테블릿 공장 가동");
    }

    @Override
    public void manage() {
        System.out.println("테블릿 공장을 관리합니다.");
    }
}
