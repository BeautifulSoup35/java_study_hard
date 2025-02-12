package chapter07_methods;
/*
     method overloading
        매개변수의 형태가 다르면 동일한 메서드 명을 가지고 정의할 수 있다
        즉, 메서드 명은 동일하고 파라미터에 들어가는 자료형 및 변수명을 달리 사용가능하다는것
        getstar(int a) != getstar(string a)
        장점: 동일한 기능 메서드 정의할때 (타입만 다르다면 가능)

        add(int a. int b)라는 메서드를 정의 했을때
        add(1,2)집어넣어서 3만들고
        add(3, 3) 집어넣어서 6만들면
        1부터 n까지 구할 수 있다.
        근데
        add(int a, int b ... int n),으로 정의할때 n의 개수가 고정되있지 않으면 오류가 발생한다.
 */
public class Overloading {
//메서드 구현
    //call1()타입
    public static void add(){
        System.out.println("add");
    }
    //call2()타입
    public static void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s);
    }
    //call2()타입
    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
        System.out.println("a+b =" +(a+b));
    }
    public static void add(String s, int a){
        System.out.println(" add(String s, int a)");
        System.out.println(s+ "/"+ a);
    }
    public static void add(int a,String s){//순서만 달라도 오버로딩에 해당
        System.out.println("add(int a,String s)");
        System.out.println(a+"/"+s);
    }
    public static void main(String[] args) {
        add(1, 2);
        add("당기시오");
        add("미시오", 3);
    }
}
