package chapter07_methods;

import java.util.Scanner;

/*

 */
public class Method02 {
    //메서드를 정의할 부분
    public  static String getStar(int rows , int select){// rows와 rowOfStars를 매칭 시킬 계획
        //사용할 지역변수선언->call4()
        String result ="";
        //select에 따라 서로 다른 결과값이 나오도론 조건문 작성
        if(select == 1){
            //왼쪽으로 치우친별
            for(int i =0; i< rows; i++){
                for(int j =0; j <i+1; j++){
                    result += "*";
                }
                result += "\n";
            }
        }else if(select ==2){
            //오 증가
            for(int i =0; i< rows; i++){
                //공백삽입
                for(int j =0; j <rows - i -1; j++){
                    result += " ";//공백깨져보이면 하나더
                }
                // 별찍기
                for(int k=0; k < i+1; k++){
                    result += "*";
                }
                result += "\n";
            }

        }else if(select ==3){
            for(int i =0; i< rows; i++){
                for(int j =0; j <rows -i; j++){
                    result += "*";
                }
                result += "\n";
            }


        }else if(select ==4){
            //오른쪽으로 감소하는 별찍기
            for(int i =0; i< rows; i++){
                //공백
                for(int j =0; j <i; j++){
                    result += " ";//공백깨져보이면 하나더
                }
                // 별찍기
                for(int k=0; k < rows - i; k++){
                    result += "*";
                }
                //개행
                result += "\n";
            }


        }else{
//            System.out.println("입력 오류입니다");
            result= "입력오류";
        }


        return result;
    }


    //메서드 호출부분
    public static void main(String[] args) {
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
