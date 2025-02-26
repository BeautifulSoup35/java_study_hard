package chapter20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
    JSON(JavaScript Object Notation) : 본래 자바스크립트 언어로부터 파생되어 자바스크립트 구문을 따르지만, 언어 독립형 데이터 포멧
    프로그래밍 언어나 플랫폼에 독립적이기 때문에 구문 분석 및 JSON 데이터 생성을 위한 코드는 자바, 파이썬 등 다양한 언어에서 쉽게 이용 가능

    데이터를 주고받을 때, Json 형식을 많이 사용한다. Java에서 org.json 라이브러리를 이용하여 JSON 데이터를 다룰 수 있다.

    {
            "이름공간(key)": "값(value)",
            "값 구분자": "각각의 값들은 ','(콤마)로 구분되어야 합니다.",
            "이스케이프": "키가 값에서 큰따옴표를 쓰고 싶으면-특정 문자를 이스케이프 하려면- \" 처럼 문자 앞에 역슬래시를 붙입니다.",
            "자료형": "표현 가능한 자료형은 String, int, double, boolean, null, object, array 6개 입니다.",
            "문자열 값": "큰따옴표로 감싸서 표현됨 - 자바와 같음.",
            "숫자": 123456, // 큰따옴표 없이 표현됨
            "boolean 값": true,
            "null 값": null,
            "object 값": {
                "값1": 123456789,
                "값2": false,
                "값3": {
                    "객체 내부": "객체 위치 가능",
                    "구분자": "key-value 구분은 ':'(콜론)으로 이루어집니다."
                }
            },
            "Arrray 값": [
                "여기에 String을 넣고 싶다면 다시 ""를 써야합니다.",
                {
                    "현재 값의 인덱스": 1,
                    "해당 방식처럼": "배열 안에 여러 값을 넣는 것도 가능"
                },
                [ "배열", "내부에", "배열을", "삽입하는 것도", "가능합니다."]
            ],
            "JSON 예시": "마무리"
        }

        GSON : Google JSON의 약칭 -> 자바에서 생성한 객체를 매개변수로 넣으면 GSON 객체를 생성해 tojson() 메서드를 사용,
        Map으로 매칭시킨 데이터들을 JSON String으로 반환해줍니다. 즉, json 포맷으로 일일이 작성해야하는 번거로움을 줄여줍니다.

        mvn -> Gson검색 gralde(short) 복사 biult 어쩌구 붙여넣기
        JsonObject jsonObjest = new JsonObject(); impot 클래스까지 끝
 */
public class JSON1 {
    public static void main(String[] args) {
        //jsonobject 클래스의 객체 생성
//        JsonObjest jsonObjest = new JsonObject();
        JsonObject jsonObjest = new JsonObject();

        //속성 (키 값 쌍) 추가하는 메서드 -> addProperty() 메서드 사용
//엔트르 어쩌고 용어 충돌 어쩌고 ??
        jsonObjest.addProperty("username","geunsu");
        jsonObjest.addProperty("password","1234");
        jsonObjest.addProperty("email","geunsu");
        jsonObjest.addProperty("name","안근수");

        //json 객체 출력
        System.out.println(jsonObjest);
        //-> map과의 차이점
        //결과값: {"username":"geunsu","password":"geunsu","email":"geunsu","name":"geunsu"}

        //""가 키값에도 있다
        //자료형이 string라는 점을 보인다
        //2. map에서 이퀄= 로 나타냈지만
        //json에는 :로 표현됨


        jsonObjest.addProperty("age", 38);
        jsonObjest.addProperty("job", "자바 강사");
        // 출력시 옆으로만 계속 길어짐 : 가독성 저하
        //추가적인 class를 import해와서 가독성을 증진시킨 방식으로 출력
        //-> prettyPrinting
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //빌더 패턴과 유사하다 빌더? 상속패턴

        //jsonOdject를 prettyPrinting 적용된 json 문자열 형태로 반환
        String json = gson.toJson(jsonObjest);

        System.out.println(json);

        /*
        Gson 라이브러리 :
            목적 : GSON 라이브러리는 JAVA 객체를 JSON형태로 변환하거나
                그 반대로 변환하는데 사용
            주요 클래스
                gson 변환을 위해 (json <-> java 객체)주로 사용되는 클래스
         */

    }

}
