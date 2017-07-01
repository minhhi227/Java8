package prob1;

public class Product {
	private String name;
	private Integer price;
	private boolean isValiable;
	
	public String getName() {
		return name;
	}
	
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean isValiable() {
		return isValiable;
	}
	public void setValiable(boolean isValiable) {
		this.isValiable = isValiable;
	}
	public Product(String name) {
		this.name = name;
		this.isValiable = true;
	}

	public Product(String name, Integer price) {
		this.name = name;
		this.price = price;
		this.isValiable = true;
	}

	public String getFullName() {
		// TODO Auto-generated method stub
		return this.getName() + " : " +this.getPrice();
	}
	
	
	
}
