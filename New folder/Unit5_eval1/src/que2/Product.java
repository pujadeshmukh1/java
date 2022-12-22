package que2;

public class Product {
	private int productId;
	private String productName;
	private int price;
	private int quentity;
	public Product(int productId, String productName, int price, int quentity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quentity = quentity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuentity() {
		return quentity;
	}
	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quentity="
				+ quentity + "]";
	}

}
