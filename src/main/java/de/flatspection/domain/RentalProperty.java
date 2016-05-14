package de.flatspection.domain;

import java.time.LocalDate;
import java.util.List;

import de.flatspection.domain.communication.Communication;

public class RentalProperty {

	private String id;
	private Address address;
	private User advertiser;
	private LocalDate creationDate;
	private LocalDate lastEditDate;
	private Status status;
	private List<Attribute> attributeList;
	private List<Communication> communicationList;
	
	public RentalProperty() {

	}

	public RentalProperty(String id, Address address, User advertiser, LocalDate creationDate, LocalDate lastEditDate,
			Status status, List<Attribute> attributeList, List<Communication> communicationList) {
		super();
		this.id = id;
		this.address = address;
		this.advertiser = advertiser;
		this.creationDate = creationDate;
		this.lastEditDate = lastEditDate;
		this.status = status;
		this.attributeList = attributeList;
		this.communicationList = communicationList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Attribute> getAttributeList() {
		return attributeList;
	}

	public void setAttributeList(List<Attribute> attributeList) {
		this.attributeList = attributeList;
	}

	public List<Communication> getCommunicationList() {
		return communicationList;
	}

	public void setCommunicationList(List<Communication> communicationList) {
		this.communicationList = communicationList;
	}
	
}
