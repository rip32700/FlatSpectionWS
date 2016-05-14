package de.flatspection.domain;

import java.time.LocalDate;
import java.util.List;

import de.flatspection.domain.payment.Payment;

public class User {

	private String id;
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private LocalDate birthday;
	private String phone;
	private String mobile;
	private String gender;
	private UserStatus status;
	private Address address;
	private boolean isDeleted;
	private boolean isInactive;
	private Authority authority;
	private List<Payment> paymentList; 
	
	public User() {

	}

	public User(String id, String email, String password, String firstname, String lastname, LocalDate birthday,
			String phone, String mobile, String gender, UserStatus status, Address address, boolean isDeleted,
			boolean isInactive, Authority authority, List<Payment> paymentList) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
		this.phone = phone;
		this.mobile = mobile;
		this.gender = gender;
		this.status = status;
		this.address = address;
		this.isDeleted = isDeleted;
		this.isInactive = isInactive;
		this.authority = authority;
		this.paymentList = paymentList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean isInactive() {
		return isInactive;
	}

	public void setInactive(boolean isInactive) {
		this.isInactive = isInactive;
	}

	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

	public List<Payment> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(List<Payment> paymentList) {
		this.paymentList = paymentList;
	}

}
