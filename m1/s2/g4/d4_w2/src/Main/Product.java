package Main;

public class Product {
	private int Id;
	private String nameProduct;
	private String nameCategory;
	private double price;
	
	public Product(int Id , String nameProduct, String nameCategory, double price) {
		this.Id = Id;
		this.nameProduct = nameProduct;
		this.nameCategory = nameCategory;
		this.price = price;
	};
	
	// --------------------------------------------------------------------------------------
	
	public String getNameProduct() {
		return nameProduct;
	};
	
	public String getNameCategory() {
		return nameCategory;
	};
	
	public int getPrice() {
		return (int) price;
	};
	
	// --------------------------------------------------------------------------------------
	
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	};
	
	
	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	};
	
	
	public void setPrice(int price) {
		this.price = price;
	};
	
}
