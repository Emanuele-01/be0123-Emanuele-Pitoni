package Main;

public class Customer {
	private int Id;
	private String nameCustumer;
	private int tier;
	
	public Customer(int Id, String nameCustumer, int tier) {
		this.Id = Id;
		this.nameCustumer = nameCustumer;
		this.tier = tier;
	};
	
	// ------------------------------------------------------------------
	
	public String getNameCustumer() {
		return nameCustumer;
	};
	public int getTier() {
		return (int) tier;
	};
	
	// ------------------------------------------------------------------
	
	public void setNameCustumer(String nameCustumer) {
		this.nameCustumer = nameCustumer;
	};
	
	public void setTier(int tier) {
		this.tier = tier;
	};
	
}
