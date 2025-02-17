package chapter12_inheritance.products;

public class ProductMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반상품 ", "일반 카테고리");

        System.out.println(item1.getName());
        System.out.println(item1.getCategory());
        System.out.println();
//        item1.getName();
        /*
            product 클래스의 인스턴스인 proiduct1을 생성하는데
            이름 -> 가전제품
            카테고리 -> 가전제품
            가격 -> 10000
            재고 -> 10
            setter 이용해서 가전제품을 백색가전 제품으로 바꿔라
         */
        Product product1 = new Product("전자제품", "가전제품", 10000, 10);
        product1.setCategory("백색 가전 제품");
        System.out.println(product1.getCategory());

        product1.displayInfo();
    }

}
