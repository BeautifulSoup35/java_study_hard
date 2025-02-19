package chapter14_casting.animals;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("강아지가 짖습니다");//재정의
    }

    //dog만의 고유 클래스
    public void fetch(){
        System.out.println("강아지가 공을 물어옵니다");
    }
}
