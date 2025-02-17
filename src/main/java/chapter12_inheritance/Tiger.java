package chapter12_inheritance;

public class Tiger extends Animal{//자식 클래스명 extands
//필드 작성 안된 상태
    public Tiger() {
    }

    public Tiger(String animalName) {
        super(animalName);//super 키워드 중요
    }

    public Tiger(int animalAge) {
        super(animalAge);
    }

    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override//부모의 클랫들          //@Override가 붙어있다면 해당 메서드는 상속 받은 메서드
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
        super.move();  //super() 는 생성자에 해당//생략가능//
        System.out.println("호랑이가 네 발로 걷습니다");// 재정의한 영역 -> 이로써 부모의 메서드와 자식의 메서드가 다르다
    }
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다");
    }
}
