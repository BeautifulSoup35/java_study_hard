package chapter12_inheritance.products;
/*
    부모 item
    자식 product
    실행 productMain

    필드 private String name, private String category
    생성자
    -name category 하나만 가지는 생산자를 각각 생성하는 것은 불가능
    String으로 받기에 코드 충돌이 일어난다

 */
public class Item {
    //필드 선언
    private String name;
    private String category;

    public Item() {
    }

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
