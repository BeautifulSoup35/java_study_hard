package chapter05_condition;

import java.util.Scanner;

/*
    switch
    형식 :
    switch(변수) 변수는 String, int 가능
        case 조건1:
            실행문1
            break;
        case조건 여러개 가능
        case에 해당 하는 변수가 없을때 사용한다 default
        break 해당 조건문 반복문을 그 자리에서 종료시키는 명령어
 */
public class Condition05Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selected = null;     // 초기화
        int selectde2 =0;
        System.out.println("메뉴 선택");
//        selected = scanner.nextLine();
        selectde2 = scanner.nextInt();
        System.out.println("[선택프로그램]");
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");

        switch (selectde2){
            case 1:
                System.out.println("메뉴1 선택");
                break;
            case 2:
                System.out.println("메뉴2 선택");
                break;
            case 3:
                System.out.println("메뉴3 선택");
                break;
            case 4:
                System.out.println("메뉴4 선택");
                break;
            case 5:
                System.out.println("메뉴5 선택");
                break;
            default:
                System.out.println("잘못입력");
        }

//        if (selected == "a"){
//            System.out.println("메뉴 1을 선택하셨습니다");
//        }else if (selected.equals("b")){
//            System.out.println("메뉴 2을 선택");
//        }
        //가독성 낮다
//        switch (selected){
//            case "a":
//                System.out.println("메뉴1를 선택하셨습니다");
//                break;
//            case "b":
//                System.out.println("메뉴2를 선택하셨습니다");
//                break;
//            case "c":
//                System.out.println("메뉴3를 선택하셨습니다");
//                break;
//            case "d":
//                System.out.println("메뉴4를 선택하셨습니다");
//                break;
//            case "e":
//                System.out.println("메뉴5를 선택하셨습니다");
//                break;
//            default:
//                System.out.println("잘못선택했다");
//        }//의도적으로 삭제
    }
}
