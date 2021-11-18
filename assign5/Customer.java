package assign5;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Customer {

	private String customerName;
	private int customerId,customerContact;
//@Resource	
	@Inject
	private Adress customerAdress;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public Adress getCustomerAdress() {
		return customerAdress;
	}
	@Required
	public void setCustomerAdress(Adress customerAdress) {
		this.customerAdress = customerAdress;
	}
	
	public void getDetails()
	{
		System.out.println(getCustomerName());
		System.out.println(getCustomerId());
		System.out.println(getCustomerContact());
		System.out.println(getCustomerAdress().getCity());
		System.out.println(getCustomerAdress().getStreet());
		System.out.println(getCustomerAdress().getState());
		System.out.println(getCustomerAdress().getZip());
		System.out.println(getCustomerAdress().getCountry());
	}
	
}
