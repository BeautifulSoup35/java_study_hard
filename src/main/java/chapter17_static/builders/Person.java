package chapter17_static.builders;

public class Person {

    //필드 선언
    private String name;
    private int age;
    private String address;

    //생성자전부 만들기

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age, String address) {
        this.age = age;
        this.address = address;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //객체 생성할때 좀 더 편하게 하는법


}
