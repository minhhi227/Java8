package prob2;

public class LibraryMember {
	private CheckoutRecord checkoutRecord;
	
	private String memeberId;
	private String firstName;
	private String lastName;
	private String phone;
	

	public LibraryMember(String memeberId, String firstName, String lastName, String phone) {
		this.memeberId = memeberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getMemeberId() {
		return memeberId;
	}

	public void setMemeberId(String memeberId) {
		this.memeberId = memeberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}
	
}
