package chapter19;
import java.util.*;

/*
컬렉션(Collection)은 여러 객체를 모아놓은 것을 의미함.
종류 :
        1. List : 순서가 있는 데이터의 집합으로, 중복된 요소를 허용함.
        - ArrayList : 배열 기반의 리스트, 요소 접근 속도가 빠름.
        - LinkedList : 연결 리스트의 리스트, 삽입 / 삭제 속도가 빠름.

        2. Set : 중복을 허용하지 않는 데이터들의 집합
            - HashSet : 해시 테이블 기반의 집합, 요소의 순서를 보장하지 않음.
            - TreeSet : 이진(binary) 검색 트리 기반의 집합, 요소가 정렬된 상태로 유지됨.

        3. Map : 키(Key)와 값(Value)의 쌍으로 이루어진 데이터의 집합.
            - HashMap : 해시 테이블 기반의 맵, 키의 순서를 보장하지 않음.
            - TreeMap : 이진 검색 트리 기반의 맵, 키가 정렬된 상태로 유지됨.
        */
public class StrList {
    public static void main(String[] args) {
        // ArrayList 생성 및 초기화
        List<String> strList = new ArrayList<>();
        int[] intArray = new int[3];

        // 배열과의 비교
        intArray[0] = 1;
        // List의 데이터 삽입
        strList.add("java");            // 배열과 달리 메서드를 통해서 집어넣습니다.
        strList.add("python");
        strList.add("C#");
        strList.add("JavaScript");
        strList.add("Kotlin");

        System.out.println(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(strList);
        // 얘는 toString()이 정의돼있습니다.
        //특정 element  검색 -> contains()

        //element String데이터 중 일부만 자른 검색 결과확인
        String searchElem2 = " py";
        boolean contain2 = strList.contains(searchElem2); //3형식 문장으로 생각
        System.out.println(searchElem2 + "포함여부" + contain2);

        //문장 검색확인이 아니라 list 내부의 요소를 전체 확인
        //하는 것이기 때문에 element의 일부인 문자열로는 여부확인 불가능

        //삭제 메서드
        String removeElem = "C#";
        boolean removed = strList.remove(removeElem);
        System.out.println(removeElem + " : 삭제여부 " + removed);
        System.out.println(strList);

        //마찬가지로 .remove() 역시 element전체가 일치하는지를 확인하고 삭제를 수행하기 때문에
        //element의 일부 데이터만 가지고 삭제를 진행할수없다

        String removeElem2 = "py";
        boolean removed2 = strList.remove(removeElem2);
        System.out.println(removeElem2 + " : 삭제여부 " + removed2);//false
        System.out.println(strList);//[java, python, JavaScript, Kotlin]

        //list정렬 -> collections
        Collections.sort(strList);//배열과 유사하게 원본의 정렬을 바꿉니다 변수 대입할 필요 없다
        System.out.println("정렬된 list" + strList);//[JavaScript, Kotlin, java, python] -> 유니코드 기준


        //list역순 정렬 -> coolections.reverseOrder 배열과 완전히 동일
        Collections.sort(strList, Collections.reverseOrder());
        //Collections.sort static 메섣
        System.out.println("역순 정렬된 list : "+ strList);

        //list element  출력
//        System.out.println(strList[0]); error
        System.out.println(strList.get(0));
        //리스트 각 요소 전체 출력하시오
        for(int i = 0; i <4; i++){
            System.out.print(strList.get(i)+ " ");
        }
        for(int i = 0; i < strList.size(); i++){
            System.out.print(strList.get(i)+ " ");
        }

        //arry의 경우 length list는 size()
        System.out.println();
        for(String str : strList){
            System.out.print(str + " ");
        }
    }
}
