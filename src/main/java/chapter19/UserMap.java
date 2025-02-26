package chapter19;

import java.util.*;

public class UserMap {
    public static void main(String[] args) {
//        Map<String, String> userMap = new HashMap<>();
        Map<String, String> userMap = new HashMap<>();
        userMap.put("username", " geunsu");
        userMap.put("password", "1234");
        userMap.put("email", "maybeage@gmail.com");
        userMap.put("name", "안근수");


        Set<Map.Entry<String, String>> entrySet = userMap.entrySet();

        //usermap의 key 값들을 set으로 받아오시오
        Set<String> keySet = userMap.keySet();//[password, name, email, username]
        //keyset을 list로 바꾸면 순서가 있지 않을까
        List<String> keyList = new ArrayList<>();
        keyList.addAll(keySet);//이제 인덱스 넘버가 있다
        //username, password, email, name
        String keyName1 = keyList.get(3);
        String keyName2 = keyList.get(0);
        String keyName3 = keyList.get(2);
        String keyName4 = keyList.get(1);

        List<String> keyList2 = new ArrayList<>();
        keyList2.add(keyName1);
        keyList2.add(keyName2);
        keyList2.add(keyName3);
        keyList2.add(keyName4);
        System.out.println(keyList2);//[username, password, email, name]

        List<String> valueList = new ArrayList<>();

//        valueList.add(value1);
        Collection<String> valueSet = userMap.values();
        System.out.println(valueSet);
    }
}
