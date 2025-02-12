package chapter09_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        //Person 객체 생성
        Person person01 = new Person();
        //기본 생산자라 정의하지 않아도 괜찮음.



//        person01.name = "안근수"; private  적용후 오류가 발생한다
//        person01.age = 1000;    //필드에 직접 접근하여 데이터를 대입하는 방식 -> 직접접근
//
//        System.out.println(person01.age);

        //setter 적용부분
        //setter은 method -> 호출방식: 객체명.메서드명()

        person01.setName("안근수"); //변경 전 이름:null
        person01.setName("김일이삼사");// 변경전 이름으로 표시되지 않음
        person01.setName("김오");//변경 전 이름:안근수

        person01.setAge(1000);
        person01.setAge(19);

        System.out.println("제 이름은 "+person01.getName()+ "입니다.");
//        System.out.println(person01.name);//오류발생
        System.out.println("저는 올해 "+person01.getAge()+"살입니다. 내년에는 "+(person01.getAge() +1)+"살이 됩니다.");
//        System.out.println(person01.setInfo());

    }

    //getAge를 정의하시고 person01 객체의 나이를 조회하여

}
