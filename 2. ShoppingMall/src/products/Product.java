package products;

public abstract class Product {

	protected String categoryName;
	protected String productName;
	protected int price;
	protected int remainingStock;
	
	public Product(String categoryName, String productName, int price, int remainingStock) {
		this.categoryName = categoryName;
		this.productName = productName;
		this.price = price;
		this.remainingStock = remainingStock;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	};
	
	public String getCategoryName() {
		return this.categoryName;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getRemainingStock() {
		return this.remainingStock;
	}
	
	public void deductRemainingStock() {
		this.remainingStock--;
	}
	
	public void printDetail(int num) {
		System.out.printf("#  상품명%d : %s, 가격 : %d, 남은 재고 : %d\n", num + 1, productName, price, remainingStock);
	};
}
