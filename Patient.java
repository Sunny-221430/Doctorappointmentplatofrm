package sunny.dpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Column(name="PatientID")
	private Long patientid;
	private String Lastname;
	private String Firstname;
	@Column(name="AddressLine1")
	private String Addressline1;
	@Column(name="AddressLine2")
	private String Addressline2;
	@Column(name="Postalcode")
	private Long pincode;
	@Column(name="Contact")
	private Long contact;
	@Column(name="Gender")
	private String gender;
	@Column(name="Email Id")
	private String emailid;
	@Column(name="CityId")
	private Long cityid;
	@Column(name="Password")
	private String password;
	@Column(name="Gaurdian_Id")
	private Long gaurdianid;

	public Long getPatientid() {
		return patientid;
	}

	public void setPatientid(Long patientid) {
		this.patientid = patientid;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Long getCityid() {
		return cityid;
	}

	public void setCityid(Long cityid) {
		this.cityid = cityid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getGaurdianid() {
		return gaurdianid;
	}

	public void setGaurdianid(Long gaurdianid) {
		this.gaurdianid = gaurdianid;
	}

	@Override
	public String toString() {
		return "patientdetails [patientid=" + patientid + ", Lastname=" + Lastname + ", Firstname=" + Firstname
				+ ", Addressline1=" + Addressline1 + ", Addressline2=" + Addressline2 + ", pincode=" + pincode
				+ ", contact=" + contact + ", gender=" + gender + ", emailid=" + emailid + ", cityid=" + cityid
				+ ", password=" + password + ", gaurdianid=" + gaurdianid + "]";
	}

}
