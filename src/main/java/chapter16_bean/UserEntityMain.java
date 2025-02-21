package chapter16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity userEntity1 = new UserEntity();
        /*
            필드에 값 넣기
         */
        userEntity1.setName("권민주");
        userEntity1.setEmail("a@test.com");
        userEntity1.setPassword(9876);
        userEntity1.setUsername(1);
        System.out.println(userEntity1);

        //롬복 적용한 부분 처리
        UserEntityLombok userEntity2 = new UserEntityLombok();
        userEntity2.setUsername(2);
        // 1234/b@test.com// 김이
        userEntity2.setName("김이");
        userEntity2.setEmail("b@test.com");
        userEntity2.setPassword(1234);

        System.out.println("이메일: "+userEntity2.getEmail());
        System.out.println("비밀번호: "+userEntity2.getPassword());
        System.out.println("이름: "+userEntity2.getName());
        System.out.println("닉네임: "+userEntity2.getUsername());

    }
}
