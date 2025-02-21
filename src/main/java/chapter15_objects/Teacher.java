package chapter15_objects;

import java.util.Objects;

public class Teacher { //extens 할 필요없는이유 -> 모든 클래스는 odject를 받는다
    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    //odject메서드들 모버라이딩

    public Teacher() {
        super();
    }

    //alt ins 전체 odject 매서드들을 가지고 올 경우
    //toString이 재정의된 형태가 아니라
    //odject 클래스의 매서드 그 자체가 불러와짐
    //-> 객체명을  spout 했을 경우 주소값만 출력됨
    /*
    @Override
    public String toString() {
        return super.toString();//부모 클래스의 특정부분 호출 -> 객체의 주소 그대로 리턴 -> 사람이 봐도 모르는 주소뿐
    }
    */
    //alt ins 에서 toString을 따로 가져와야함

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
