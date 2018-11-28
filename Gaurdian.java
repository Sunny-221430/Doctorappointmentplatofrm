package sunny.dpa.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Gaurdian_user")
public class Gaurdian {

	private Long GaurdianUserid;
	private String Lastname;
	private String Firstname;
	private String Addressline1;
	private String Addressline2;
	private Long pincode;
	private Long contact;
	private String emailid;

	public Long getGaurdianUserid() {
		return GaurdianUserid;
	}

	public void setGaurdianUserid(Long gaurdianUserid) {
		GaurdianUserid = gaurdianUserid;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getAddressline1() {
		return Addressline1;
	}

	public void setAddressline1(String addressline1) {
		Addressline1 = addressline1;
	}

	public String getAddressline2() {
		return Addressline2;
	}

	public void setAddressline2(String addressline2) {
		Addressline2 = addressline2;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "Gaurdian [GaurdianUserid=" + GaurdianUserid + ", Lastname=" + Lastname + ", Firstname=" + Firstname
				+ ", Addressline1=" + Addressline1 + ", Addressline2=" + Addressline2 + ", pincode=" + pincode
				+ ", contact=" + contact + ", emailid=" + emailid + "]";
	}

	
	}
