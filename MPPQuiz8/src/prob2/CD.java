package prob2;

public class CD extends LendingItem {
	private String productId;
	private String title;
	private String company;
	
	
	public CD(String productId, String title, String company) {
		this.productId = productId;
		this.title = title;
		this.company = company;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(!this.getClass().getName().equals(obj.getClass().getName())) return false;
		CD tmp = (CD)obj;
		if(this.getTitle().equals(tmp.getTitle())
				&&this.getCompany().equals(tmp.getCompany())
				&&this.getProductId().equals(tmp.getProductId())
				)
		{
			return true;
		}
		else return false;
	}
	
	
}
