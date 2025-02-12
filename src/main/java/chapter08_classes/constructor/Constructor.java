package chapter08_classes.constructor;
/*
    생성자(constructor)
        생성자는 객체가 생성될 때 호출되는 특별한 메서드

    ClassExample example = new ClassExample();
    -> 객체의 이름이 example이다

    new ClassExample() 생성자이다.

    특징 :
        1. 클래스의 이름과 생성자 이름은 동일하다(즉, 다른 메서드들과 달리 대문자로 시작)
        2. return 값이 없다 call1(), call2() 유형이 떠올랐다면 성공적
        3. 객체 초기화 : 생성자는 객체의 필드 초기화를 담당함.

    생성자의 정의 방식:
        1. 기본 생성자: 매개변수가 없는 생성자(사실 클래스를 만들때 default로 생성되어
            정의하지 않아도 될때가 있다)
            ClassA, Car에서 기본 생성자를 정의하지 않고, ClassAMain에서 CarMain에서 객체를 생성했었습니다.

        2.
 */
public class Constructor {
    //필드 선언
    int num;
    String name;
    String title;
    //기본 생성자를 직접 작성해볼 예정 -> call1() 유형으로 작성된다
    Constructor(){
        System.out.println("NoArgsConstructor(기본 생성자)");
    }
    //매개변수 생성자 -> 기본적으로 만들어지지 않습니다 -> 개발자가 정의해야함 -> call2()

    Constructor(int num){
        System.out.println("requiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = num;// this 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체됨

        //예를 들어 constructor con1 = new Constructor(10)으로 했다면
        //this 부분이 con1으로 대체됨.

        // 매개변수가 string name 인 생성자
        
    }
    Constructor(String title){
        System.out.println("매개변수를 필수로 요구하는 생성자");
        this.name = title;

    }
    Constructor(int num, String name){
        System.out.println("매개변수를 필수로 요구하는 생성자");
        this.num = num;
        this.name = name;
//오버스트링 권유
    }
    //속성이 두 개 밖에 없기에 객체 하나당 조횔르 두번만 하면 되지만
    //속성 개수가 매우 많을때 대비해 속성전체 확인 메서드 정의

    //위의 부분들은 전부 생성자와 속성과 관련된 부분
    //행위의 메서드를 정의하지 않았다

    //call1() 타입으로 작성
    void  showInFo(){
        System.out.println("해당 객체의 num 값 >>" + num);
        System.out.println("해당 객체의 name 값>>" + name);
    }
    //call3타입ㅂ으로 작성

    String showInFo2(){
        return "해당객체의 num 값:" + num+ "\n해당 객체의 name 값" + name;
    }
}
