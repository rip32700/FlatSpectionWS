package de.flatspection.domain;

import java.time.LocalDate;
import java.util.List;

import de.flatspection.domain.communication.Communication;
import de.flatspection.domain.user.User;

@Document
public class RentalProperty {

	@Id
	private String id;
	private Address address;
	@DBRef
	private User advertiser;
	private List<RentalPropertyAttribute> attributeList;
	private LocalDate creationDate;
	private LocalDate lastEditDate;
	private RentalPropertyStatus status;
	
	public RentalProperty() {
		
	}
	
	public RentalProperty(String id, Address address, User advertiser, List<RentalPropertyAttribute> attributeList,
			LocalDate creationDate, LocalDate lastEditDate, RentalPropertyStatus status) {
		super();
		this.id = id;
		this.address = address;
		this.advertiser = advertiser;
		this.attributeList = attributeList;
		this.creationDate = creationDate;
		this.lastEditDate = lastEditDate;
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(User advertiser) {
		this.advertiser = advertiser;
	}

	public List<RentalPropertyAttribute> getAttributeList() {
		return attributeList;
	}

	public void setAttributeList(List<RentalPropertyAttribute> attributeList) {
		this.attributeList = attributeList;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getLastEditDate() {
		return lastEditDate;
	}

	public void setLastEditDate(LocalDate lastEditDate) {
		this.lastEditDate = lastEditDate;
	}

	public RentalPropertyStatus getStatus() {
		return status;
	}

	public void setStatus(RentalPropertyStatus status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}
	
	
}
