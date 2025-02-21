package chapter15_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", " 코리아 아이티");
        Teacher teacher2 = new Teacher("안근수", " 코리아 아이티");

        //teacher1의 객체의 클래스 정보 얻기
        Class tClass = teacher1.getClass();
        System.out.println(tClass);
        //결과값 : class chapter15_objects.teacher.Teacher

        System.out.println(teacher1);
        //Teacher{name='안근수', schoolName=' 코리아 아이티'}
        //tostring을 재 정의해서 override받아서 주소가 아닌 그 값을 받을수있다
        System.out.println(teacher1.getClass().getSimpleName());
        // Class tClass = teacher1.getClass();
        System.out.println(tClass.getSimpleName());
        //결과값 : Teacher

        //필드명.. 속성명만 가지고 오는 방법
        //반복문
        //필드가 몇개일지 모르기에
        Field[] fields = tClass.getDeclaredFields();//선언되어있는 필드들의 이름을 따서 배열에 집어넣을것
        //import java.lang.reflect.Field; 새로 생신 부분 improt class하면 생기는
        System.out.println(fields);//[Ljava.lang.reflect.Field;@681a9515 -> 배열이라 주소값만 나온다

        for (int i =0; i< fields.length; i++){
            System.out.println("필드명 출력 :" + fields[i].getName());//class java.lang.String
            //내부 요수를 들고와 그들의 이름을 가져온다 getname 메서드
            System.out.println("팩키지 + 클래스명 출력 : "+ fields[i].getType());//schoolName
            System.out.println("클래스명 출력 : "+ fields[i].getType().getSimpleName());//String
        }
//        int i =1 ;
//        for (Field field : fields){
//            System.out.println("필드명 출력 :" + fields[i].getName());//class java.lang.String
//            //내부 요수를 들고와 그들의 이름을 가져온다 getname 메서드
//            System.out.println("팩키지 + 클래스명 출력 : "+ fields[i].getType());//schoolName
//            System.out.println("클래스명 출력 : "+ fields[i].getType().getSimpleName());//String
//            i++;
//        }


        for (Field field : fields){
            System.out.println("필드명 출력 :" + field.getName());//class java.lang.String
            //내부 요수를 들고와 그들의 이름을 가져온다 getname 메서드
            System.out.println("팩키지 + 클래스명 출력 : "+ field.getType());//schoolName
            System.out.println("클래스명 출력 : "+ field.getType().getSimpleName());//String
        }

//        Method[] methods = tClass.getDeclaredFields();

//        for(int i =0; i< methods.length; i++){
//            System.out.println("메서드 명 출력: "+ methods[i].getName());
//            System.out.println("메서드 명 출력: "+ methods[i].getReturnType());
//
//        }
//kdskadfljsk;;laksfdja;sldjkfdsj;klal;sjkdfklasj;dfa;slkdfjkljsf;adfjkdls;askdjfklds;alskdjfkdls;afkdls
//        for(Method method :methods){
//            System.out.println("메서드 명 출력: "+ method.getName());
//            System.out.println("메서드 명 출력: "+ method.getReturnType());
//        }

        System.out.println(teacher1);
        System.out.println(Arrays.toString(fields));
        //fields와 methods가 배열로 선언되었으니
        //arraus.tostring을 떠올려야한다
        //각 내부 요소들의 패키지 경로까지 전부 다 출려되어
        //이상의 getname 등의 메서드를 통해 반복문으로 작성해야 했다

        //.equals()
        System.out.println(teacher1.getClass() == teacher2.getClass());//true
        System.out.println(teacher1 instanceof Teacher);//true

        chapter15_objects.Teacher teacher3 = new chapter15_objects.Teacher("안근수", "코리아아이티");
        //teacher3의 경우 teacher 클래스의 인스턴스이기는 하지만 패키지 경로가 다름
        //근데 우리는 일단 두 teacher 클래스에 동일한 코드라인 작성함

//        System.out.println(teacher3 instanceof Teacher);
        // teacher3의 경우 경로가 달라 오류 발생

        System.out.println(teacher1.equals(teacher2)); //true
        //객체라는것은 인스턴스마다 서로다른값을 가지고 있어야함 그래서 둘은 다르게 나와야함
        //true가 뜬 이유는?
        //주소가 다른 인스턴스 90번째는 그래서 다르다고 말함 86번은 내부의 값이 동일한지 본다는것
        System.out.println(teacher1 == teacher2);//false
        //문자열이 같은지 판단할때 와 유사함 문자열 동일 확인할때 그래서 equlas를 쓴다

//        System.out.println(teacher3.getClass()  == Teacher.class);-> 오류 발생


    }
}
