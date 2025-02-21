package chapter16_bean;
/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)//속성값
    +----------------------------------------+
 */

public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    @Override
    public String toString() {
        return "UserEntity{" +
                "username=" + username +
                ", password=" + password +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
//get를 언제썼었지?
    public int getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }



}
