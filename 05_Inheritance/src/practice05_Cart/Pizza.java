package practice05_Cart;

public class Pizza extends Product{


		// new Pizza(2, "고구마 피자", 3000)
	
	public Pizza(int prodNO, String prodName, int prodPrice) {	
		super(prodNO, prodName, prodPrice);
		//필드가 없을때 슈퍼 클래스에 생성자 생성 (소스에서 ~~~~슈퍼클래스 선택)
	}
	
	
}
