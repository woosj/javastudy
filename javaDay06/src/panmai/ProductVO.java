package panmai;

public class ProductVO {
	
	//상품정보
	private String panme;	//상품명
	private int price, quantity;	//단가, 수량
	
	
	public String getPanme() {
		return panme;
	}
	public void setPanme(String panme) {
		this.panme = panme;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
