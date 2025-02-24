package chapter16_bean.persons;

public class Person {
    //필드

    //이하의 코드는 그대로 뒀을 경우 빨간줄이 뜨는데 해결방안이 두가지있다
    //1. name에 값을 대입해 상수를 초기화하는법 - 상수취급해준다
        //그런경우 NAME으로 표기한다
    //2. final이 붙은 변수를 필수적으로 호함하는 매개변수를 만들것

    private final String name;
    private final int age;
    //필수적인 필드를 포함한 requrideArgsconstructor를 생성
//    public Person(String name) {
//        this.name = name;
//    }


    //필수 필드 및 옵션 필드를 전부 호함한 생성자 -> allArgsConsructor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//여러분들은 setter / getter를 만드시오
    @Override
    public String toString() {
        return "이름 :"+ name + "\n나이 :" + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
