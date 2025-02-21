package chapter15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        String strExample1 = "안녕하세요";
        String strExample2 = new String("안녕하세요");

        boolean result1 = (strExample1 == strExample2);//false
        boolean result2 = (strExample1 == "안녕하세요");//true
        boolean result3 = (strExample2 == "안녕하세요");//false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        boolean result5 = strExample1.equals(strExample2);
        System.out.println(result5);//true
        //toSring 자주 쓴다

        //객체생성
        ObjectTest objectTest1 = new ObjectTest("안근수", "akvhrn");
        ObjectTest objectTest2 = new ObjectTest("권민주", "덕천");
        System.out.println(objectTest1.displayInfo2());
        objectTest1.displayInfo1();
        objectTest2.displayInfo1();

//        System.out.println(objectTest2.toString()); -> tostring 불필요
        System.out.println(objectTest2);//tostring오버라이딩 안했으면 그저 주소만 나왔을 코드
        //객체를 그냥 부르는게 사실 불가능

    }
}
