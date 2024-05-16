package encapsulation;

public class Customer {
	private String CustomerId;
	public String CustomerName;
	private String ContactNo;
	private String Address;

	public Customer() {
		this.CustomerId = "CST000001";
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
