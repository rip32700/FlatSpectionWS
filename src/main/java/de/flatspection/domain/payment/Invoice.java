package de.flatspection.domain.payment;

import java.time.LocalDate;
import java.util.Currency;
import java.util.List;

import de.flatspection.domain.RentalProperty;
import de.flatspection.domain.User;

public class Invoice {

	private long id;
	private String invoiceNo;
	private RentalProperty rentalProperty;
	private LocalDate invoiceDate;
	private LocalDate deliveryDate;
	private User recipient;
	private List<InvoiceItem> itemList;
	private Currency total;
	
	public Invoice() {
		
	}
	
	public Invoice(long id, String invoiceNo, RentalProperty rentalProperty, LocalDate invoiceDate,
			LocalDate deliveryDate, User recipient, List<InvoiceItem> itemList, Currency total) {
		super();
		this.id = id;
		this.invoiceNo = invoiceNo;
		this.rentalProperty = rentalProperty;
		this.invoiceDate = invoiceDate;
		this.deliveryDate = deliveryDate;
		this.recipient = recipient;
		this.itemList = itemList;
		this.total = total;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public RentalProperty getRentalProperty() {
		return rentalProperty;
	}
	public void setRentalProperty(RentalProperty rentalProperty) {
		this.rentalProperty = rentalProperty;
	}
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public User getRecipient() {
		return recipient;
	}
	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}
	public List<InvoiceItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<InvoiceItem> itemList) {
		this.itemList = itemList;
	}

	public Currency getTotal() {
		return total;
	}

	public void setTotal(Currency total) {
		this.total = total;
	}
	
}
