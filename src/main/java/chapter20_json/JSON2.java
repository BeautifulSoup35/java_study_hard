package chapter20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
        //data라는게 뭔 의미로 쓰였었지?
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
    
}

public class JSON2 {
    public static void main(String[] args) {
        //gson일방 / gsonbuilder 비교
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();


        //사용할 변수 선언 =>  json의 값은 string이다
        String userJson = null;

        //user1 객체를 생성하고 "kim1" , "9876", "a@test.com"
        User user1 =new User("kim1", "9876", "a@test.com", "김일", "20");;

        // gson을 통한 json 데이터로 변경
        System.out.println(gson.toJson(user1));
//        gsonBuilder pretty
//        Gson gsonBuilder = null;
        System.out.println(gsonBuilder.toJson(user1));
        //gsonBuilder를 통한 json데이터를 string변수에 넣기
        userJson = gsonBuilder.toJson(user1);
        //정상 실행이 됐다는 말은 gsonBuilder.toJson(user1); 결과값이 string이라는 의미이다

        //이상의 방법은 좀 명시적이고 직접적으로 알아보기 위한 방식으로는 instancof를 사용할수 있습니다

        boolean result1 = (gsonBuilder.toJson(user1) instanceof String);
        boolean result2 = (userJson instanceof String);
        System.out.println("결과값 : " + result1);

        //이상의 코드들은 동어반복적이지만 수업을 위해 남겨둠

        //이상까지의 코드들은 보니까  user 라는 클래스를 정의해놓고 거기에 멤버변수에 값을 대입해서
        //json 데이터로 바꾼듯 보입니다

        //그렇다면 jsonobject는 뭐였을까
        //임시클래스

        //클로스로 정의하지 않은 객체를 생성

        JsonObject jsonObject = new JsonObject();//임시적으로 클래스 역할을 할 josnOdject 객체 생성
        jsonObject.addProperty("학번", 20250001);
        jsonObject.addProperty("학과", "영어교육과");
        jsonObject.addProperty("성적", "a");

        System.out.println(jsonObject);
        System.out.println(gson.toJson(jsonObject));
        System.out.println(gsonBuilder.toJson(jsonObject));

        //key 명칭들을 보니까 대충 student 관련한 객체로 보이지만
        //직접보니 클래스명을 정의한 적 없다는 점이 user 통한 json data 변경과 차이점
    }
}
