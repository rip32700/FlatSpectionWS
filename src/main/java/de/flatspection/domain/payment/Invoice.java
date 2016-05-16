package de.flatspection.domain.payment;

import java.time.LocalDate;
import java.util.Currency;
import java.util.List;

import de.flatspection.domain.RentalProperty;
import de.flatspection.domain.user.User;

@Document
public class Invoice {

	@Id
	private String id;
	private RentalProperty rentalProperty;
	private String invoiceNumer;
	private LocalDate invoiceDate;
	private LocalDate deliveryDate;
	private List<InvoiceItem> itemList;
	private User recipient;
	private Money totalPrice;
	private InvoiceStatus status;
	private Payment payment;
	
	public Invoice() {
		
	}

	public Invoice(String id, RentalProperty rentalProperty, String invoiceNumer, LocalDate invoiceDate,
			LocalDate deliveryDate, List<InvoiceItem> itemList, User recipient, Money totalPrice, InvoiceStatus status,
			Payment payment) {
		super();
		this.id = id;
		this.rentalProperty = rentalProperty;
		this.invoiceNumer = invoiceNumer;
		this.invoiceDate = invoiceDate;
		this.deliveryDate = deliveryDate;
		this.itemList = itemList;
		this.recipient = recipient;
		this.totalPrice = totalPrice;
		this.status = status;
		this.payment = payment;
	}

	public RentalProperty getRentalProperty() {
		return rentalProperty;
	}

	public void setRentalProperty(RentalProperty rentalProperty) {
		this.rentalProperty = rentalProperty;
	}

	public String getInvoiceNumer() {
		return invoiceNumer;
	}

	public void setInvoiceNumer(String invoiceNumer) {
		this.invoiceNumer = invoiceNumer;
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

	public List<InvoiceItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<InvoiceItem> itemList) {
		this.itemList = itemList;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}

	public Money getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Money totalPrice) {
		this.totalPrice = totalPrice;
	}

	public InvoiceStatus getStatus() {
		return status;
	}

	public void setStatus(InvoiceStatus status) {
		this.status = status;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String getId() {
		return id;
	}
	
}
