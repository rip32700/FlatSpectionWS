package de.flatspection.domain;

public class Address {

	private long id;
	private String street;
	private int number;
	private String zip;
	private String city;
	private String additionalInformation;
	private String country;
	
	public Address() {
		
	}
	
	public Address(long id, String street, int number, String zip, String city, String additionalInformation,
			String country) {
		super();
		this.id = id;
		this.street = street;
		this.number = number;
		this.zip = zip;
		this.city = city;
		this.additionalInformation = additionalInformation;
		this.country = country;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
