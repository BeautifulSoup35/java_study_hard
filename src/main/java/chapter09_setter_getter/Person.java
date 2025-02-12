package chapter09_setter_getter;

public class Person {
    //필드
    private String name;
    private int age;

    // 기본 생성자, 매개변수가 하나인 매개변수 생성자 두 개, 매개변수가 두 개인 매개변수 생성자 하나

    Person(){

    }
    Person(int age){
        this.age = age;
    }
    Person(String name){
        this.name = name;

    }
    Person(int age,String name){
        this.age = age;
        this.name = name;

    }

    //setter : set + 필드명
    //call2 유형-> void 매개변수있음

    public void setName(String name){
        //메서드이기 때문에 내부에 로직을 설계가능하다
        //String name 길이가 4글자 초과라면 메서드를 강제 정지 시킴으로 입력 불가하게
        //막을 수 있다.
//        name.length();
        if(name.length() > 4){
            System.out.println("이름의 글자 수를 초과했습니다.");
            return;//?      // 메서들에서 return;으로 작성하면 메서드 자체 종료
        }
        System.out.println("이름을 수정합니다");
        System.out.println("변경 전 이름:"+ this.name);
        this.name = name;// 여기서 arg로 받은 매개변수를 필드에 대입
        System.out.println("수정 후 이름:"+ this.name);

    }
    //setAge() 매개변수 1 setInfo() 매개변수 2개
    public void setAge(int age){
        //0미만의, 200 초과 값이 입력됐을 경우 불가능한 나이
        //그 외에 값 대입이
        if(age<0 || age >200){
            System.out.println("불가능한 나이입니다.");
            return;
        }
//        else{
//            this.age = age;
//            System.out.println("나이가 입력되었습니다.");
//            System.out.println(this.age);
//        }
        this.age = age;
        System.out.println("나이가 입력되었습니다.");
        System.out.println(this.age);


    }

    public void setInfo(int age ,String name){
        this.name = name;
        this.age = age;
    }

    //Getter 구조 get+ 필드명
    //call3 -> retrun 만 있음
    //데이터 조회만 하면 되기때문에
    //필드와 동일한 자료형의 return값이 요구되기 때문에 void 조심
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


}
