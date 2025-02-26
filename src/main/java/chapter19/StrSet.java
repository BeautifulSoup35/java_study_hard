package chapter19;

import java.util.*;

/*
    list는 순서가 있고 중복을 허용하는 반면,
    set의 경우 순서는 없고 중복을 허용하지 않기 때문에
    list -> set 아니면 그 역 형변환 중요
    list를 통해 전체 설문을 받고, set을 통해 중복 제거해
    후보군을 남기는 방식으로 많이 사용된

 */
public class StrSet {
    public static void main(String[] args) {
        //사용할 변수
        Set<String> strSet = new HashSet<>();
        List<String> strList = new ArrayList<>();

        //set에서 element 삽입방법 -> .add()

        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("python");
        strSet.add("java");
        strSet.add("C#");
        strSet.add("java");
        strSet.add("1");
        strSet.add("2");
        strSet.add("2");
        strSet.add("3");
        strSet.add("2");

        //set 출력 방법 -> 세트명으로 하시면 됩니다
//        Set(strSet);
        System.out.println(strSet);//순서를 보장하지 않음 특정 요소를 추출하는것이 어렵다
        //-> list 형변환이 필요하다
        strList.addAll(strSet);
        System.out.println(strList);
        //strList에 값이 더해졌기 때문에 정렬하는 것이 가능하겠다
        Collections.sort(strList);// 원본 list
        System.out.println(strList);
        strSet.addAll(strList);//list -> set
        System.out.println(strSet);//[C#, 1, python, 2, java, 3]


//        strSet.re


    }
}
