package chapter12_inheritance;
/*
    Tiger.java 처럼 Animal 클래스 상속 받고
    Main에서
    human 객체 생성후  setter를 이용하여 이름을 받고
    getter로 출력하시오

    사실상 필드와 함수 공유
 */
public class Human extends Animal {
    public Human() {
    }

    public Human(String animalName) {
        super(animalName);
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void move() {
        super.move();
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String name){//지시사항 대롷 agument call2 or call3
        System.out.println(name);
    }
    public String read1(){
        return "멘토 자바봐";
    }
}
