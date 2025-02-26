package chapter19;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        // HashMap 생성 및 초기화 -> key와 value가 들어간다
        //제네릭으로 두개의 타입을 설정할 필요
        Map<String, String> strMap = new HashMap<>();

        strMap.put("kor20250001", "권민주");
        strMap.put("kor20250002", "김도언");
        strMap.put("kor20250003", "김태윤");
        strMap.put("kor20250004", "안민섭");
        System.out.println(strMap);

        //특정 키워 값 조회 -> .get(키)사용 키 필수적 요구
        System.out.println(strMap.get("kor20250003"));

        //특정 키 값 수정 #1-> .put()을 통해 덮어쓰기
        strMap.put("kor20250003", "김삼"); // key 하나당 하나의  value만 가지기 때문에
        System.out.println(strMap);

        //특정 값 수정 #2 -> replace
        strMap.replace("kor20250002", "김이");
        System.out.println(strMap);

        //특정 키의 존재여부
        boolean searchKeyFlag1 = strMap.containsKey("kor20250001");
        boolean searchKeyFlag2 = strMap.containsKey("kor20250010");
        System.out.println("해당 키 존재 여부 : " + searchKeyFlag1);
        System.out.println("해당 키 존재 여부 : " + searchKeyFlag2);

        // 특정 값의 존재 여부
        // strList.contains(searchElem2);
        strMap.containsValue("김일");

        //Map의 엔트리 (key value 쌍을 ㅌ홍칭)로 부터 set 생성
        Set<Map.Entry<String, String>> entrySet = strMap.entrySet();
        System.out.println(entrySet);//[kor20250002=김이, kor20250001=권민주, kor20250004=안민섭, kor20250003=김삼]
        //Map의 엔트리 (key value 쌍을 ㅌ홍칭)로 부터 list 생성
        List<Map.Entry<String, String>> entryList = new ArrayList<>();
        entryList.addAll(entrySet);// direct로 list 만들수 없ㄷ고 set경우함
        System.out.println(entryList);
        //정렬
//        Collections.sort(entryList);
        //키와 값 분류 되있어서 어렵다
        //복합구조

        //key Set출력 -> strMap 제네릭의 첫 번째 매개변수인 key에 해당하는 자료형을 넣어야함
        Set<String> keySet = strMap.keySet();
        System.out.println(keySet);

        //value Set 출력 -> 제네릭의 두번째  매개변수인 vlaie 해당하는 자료형을 넣어야함
        Collection<String> valueSet = strMap.values(); // collections가 아니라
        //key는 중복이 불가능하기 때문에 set를 쓰는데 value는 중복되어 있을수 있어
        //set를 쓰,게 되면 중복 제거가 될 확룰로 collection 쓴다
        System.out.println(valueSet);//[김이, 권민주, 안민섭, 김삼]


    }
}
