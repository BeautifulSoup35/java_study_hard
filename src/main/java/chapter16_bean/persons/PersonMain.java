package chapter16_bean.persons;

public class PersonMain {
    public static void main(String[] args) {
//        Person person1 = new Person("안근수");     //final때문에 name변수는 꼭대입돼야함
        Person person2 = new Person("안근순", 20);

        PersonLombok person3 = new PersonLombok("권민주");
        PersonLombok person4 = new PersonLombok("김사", 19);

        person3.setAge(21);

        person3.toString();
        System.out.println(person3);

        System.out.println(person4);



    }
}
