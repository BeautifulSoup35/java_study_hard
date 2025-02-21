package chapter15_objects;
/*
     모든 클래스는 OBJECT의 상속을 받는다
     interface 부분을 override method했을때 object 클래스와 관련된 부분을
     확인했습니다.

     1.toString:객체의 문자열 표현
        기본적으로 모든 클래스는 object 클래스를 상속 받으며, object의 toString메서드는 클래스 이름과 해시 콯드를 반환홤
        이를 override하여 재정의해서 필드를 표현하는 등 다양한 방식으로 변환시켜 사용하는 편

        왜 사용하는가 사람들이 읽기 편한 방식으로 재정의하고, 객체명만으로 불러오는 것치 가능함./ 즉 객체명.toString으로 쓰지않고 객체명 만으로 호출 가능

    2. equals(): 객체의 동등성 표현
        두객체가 논리적으로 같은질르 비교하는 메서드
        기본적으로 object클래스의  equals()메서드는 두 객체의 참조 주소를 비교한다
        형식:
             객체명1.equlas(객체명2)
             객체1과 객체2의 참조 주소가 동일한지 확인
             3형식과 유사

     3. hasCode(): 객체의 고유 값
        객체를 정수값(해시값으로 반환)
        해시 값은 주로 해시 기반 컬렉션에서 사용됩니다.(추후 수업예정)
        EQUALS() Override를 하면 hasCode도 반듯기 오버라이드를 해야한다
        동일한 객체를 가져야 하기 때문
 */
public class ObjectTest {

    private String name;
    private String address;

    //기본 생성자, 매개변수 생성자 (all)


    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo1(){
        System.out.println("이름 : " + this.name);
        System.out.println("주소 : " + this.address);
    }
    public String displayInfo2(){
        return "이름 : "+ this.name + "\n주소 : " + this.address;
    }

    /* 1.toString:객체의 문자열 표현
        기본적으로 모든 클래스는 object 클래스를 상속 받으며, object의 toString메서드는 클래스 이름과 해시 콯드를 반환홤
        이를 override하여 재정의해서 필드를 표현하는 등 다양한 방식으로 변환시켜 사용하는 편

        왜 사용하는가 사람들이 읽기 편한 방식으로 재정의하고, 객체명만으로 불러오는 것치 가능함.
        / 즉 객체명.toString으로 쓰지않고 객체명 만으로 호출 가능

     */
//toString:객체의 문자열 표현 overriding -> 재정의할 수있다
    @Override
    public String toString() {
        return  "이름 : "+ this.name + "\n주소 : " + this.address;

    }
}
