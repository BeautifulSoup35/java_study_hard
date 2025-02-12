package chapter07_methods;

import java.util.Scanner;

public class MethodSwitch03 {
    /*
    02 파일에서 별찍기 구현 코드 getStar 내부의 if문들을 switch문으로 치환하시오
        regactoring리팩토링 과정 -동일한 기능인데 가독성을 높이는 행위
     */
    public  static  String getStar(int totalLine, int menuSelect){
        String result ="";
        // Method02.java의 if문을 교체하시오
        switch (menuSelect){
            case 1:
                for(int i =0; i< totalLine; i++){
                    for(int j =0; j <i+1; j++){
                        result += "*";
                    }result += "\n";
                }//i+1
                break;
            case 2:
                for(int i =0; i< totalLine; i++){
                    //공백삽입
                    for(int j =0; j <totalLine - (i -1); j++){
                        result += " ";//공백깨져보이면 하나더
                    }
                    // 별찍기
                    for(int k=0; k < i+1; k++){
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                for(int i =0; i< totalLine; i++){
                    for(int j =0; j <totalLine -i; j++){
                        result += "*";
                    }
                    result += "\n";
                }//totalLine -i
                break;
            case 4:
                for(int i =0; i< totalLine; i++){
                    //공백
                    for(int j =0; j <i; j++){
                        result += " ";//공백깨져보이면 하나더
                    }
                    // 별찍기
                    for(int k=0; k < totalLine - i; k++){
                        result += "*";
                    }//개행
                    result += "\n";
                }break;
            default:
//                System.out.println("입력 오류입니다");
                result = "오류";// 최대한 return 의 장점을 살린 방법 전부 프린트 없으니 통일성 높이기
//                break; //생략
        }
        return result;
    }

    public static void main(String[] args) {
        //메인 단계에서 메뉴명 등을 작성해서 method02와 동일한 형태로 실행될 수 있도록 작성
        Scanner scanner = new Scanner(System.in);

        int rowOfStars;
        int choice ;
        String starresult;
        System.out.print("몇 줄짜리 별을 생성할까요>>>");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는별");
        System.out.println("2. 오른쪽으로 치우친 증가하는별");
        System.out.println("3. 왼쪽으로 치우친 감소하는별");
        System.out.println("4. 오른으로 치우친 감소하는별");
        System.out.print("메뉴를 숫자로 선택하세요>>>");
        choice = scanner.nextInt();
        starresult = getStar(rowOfStars, choice);
        System.out.println(starresult);
    }
}
