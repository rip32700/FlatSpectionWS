package de.flatspection.domain.user;

import java.time.LocalDate;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;

import de.flatspection.domain.Address;
import de.flatspection.domain.media.MediaTemplate;
import de.flatspection.domain.payment.Payment;

@Document
public class User {

	@Id
	private String id;
	@Indexed
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private LocalDate birthday;
	private String phone;
	private String mobile;
	private Gender gender;
	private EnumSet<UserStatus> statusSet;
	private Address address;
	private Authority authority;
	private List<Payment> paymentList; 
	private Locale language;
	private List<MediaTemplate> mediaTemplateList;
	
	public User() {

	}

	public User(String id, String email, String password, String firstname, String lastname, LocalDate birthday,
			String phone, String mobile, Gender gender, EnumSet<UserStatus> statusSet, Address address,
			Authority authority, List<Payment> paymentList, Locale language, List<MediaTemplate> mediaTemplateList) {
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
		this.statusSet = statusSet;
		this.address = address;
		this.authority = authority;
		this.paymentList = paymentList;
		this.language = language;
		this.mediaTemplateList = mediaTemplateList;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public EnumSet<UserStatus> getStatusSet() {
		return statusSet;
	}

	public void setStatusSet(EnumSet<UserStatus> statusSet) {
		this.statusSet = statusSet;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public Locale getLanguage() {
		return language;
	}

	public void setLanguage(Locale language) {
		this.language = language;
	}

	public List<MediaTemplate> getMediaTemplateList() {
		return mediaTemplateList;
	}

	public void setMediaTemplateList(List<MediaTemplate> mediaTemplateList) {
		this.mediaTemplateList = mediaTemplateList;
	}

	public String getId() {
		return id;
	}

}
