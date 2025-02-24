package chapter17_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();
        //1번째 productView 객체가 생성되었습니다

        productView1.showMainView();
        productView2.showMainView();
        productView3.showMainView();
        //하나의 데이터 베이스 안에서만 정보 추적이 가능한다
    }
}
