package chapter12_inheritance;

public class Animal {

    //필드 선언
    private String animalName;
    private int animalAge;

    //생성자 하나 하나 정의하세요


    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

//setter
    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

//getter
    public int getAnimalAge() {
        return animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }
    public  void move(){
        System.out.println("움직입니다. ");

    }
}
