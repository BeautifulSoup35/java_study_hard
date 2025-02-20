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

    }
}
