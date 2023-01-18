package practice05_Cart;

public class Product {

	private String prodName;
	private int prodNO;
	private int prodPrice;
	
	public Product(int prodNO, String prodName, int prodPrice) {
		super();
		this.prodName = prodName;
		this.prodNO = prodNO;
		this.prodPrice = prodPrice;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdNO() {
		return prodNO;
	}

	public void setProdNO(int prodNO) {
		this.prodNO = prodNO;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	
	
	
	
}
