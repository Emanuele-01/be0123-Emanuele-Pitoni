package Main;

public class Order {
	private int Id;
	private String status;
	private String orderDate;
	private String deliveryDate;
	private Product product;
	private Customer customer;
	
	public Order(int Id, String status, String orderDate, String deliveryDate, Product product, Customer Customer) {
		this.Id = Id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.product = product;
		this.customer = Customer;
	};
	
	// ------------------------------------------------------------------------------------------------------------------
	
	public String getStatus() {
		return status;
	};
	
	public String getOrderDate() {
		return orderDate;
	};
	
	public String getDeliveryDate() {
		return deliveryDate;
	};
	
	public Product getProduct() {
		return product;
	};
	
	public Customer getCustomer() {
		return customer;
	};
	
	// ------------------------------------------------------------------------------------------------------------------
	
	public void setStatus(String status) {
		this.status = status;
	};
	
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	};
	
	
	public void setDeliveryDate(String deliveryDate) {
		this.orderDate = deliveryDate;
	};
	
	public void setProduct(Product product) {
		this.product = product;
	};
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	};
	
}
