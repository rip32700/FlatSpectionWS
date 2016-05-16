package de.flatspection.domain.payment;

public class InvoiceItem {

	private int position;
	private Service service;
	private int quantity;
	private Money totalPrice;
	
	public InvoiceItem() {

	}

	public InvoiceItem(int position, Service service, int quantity, Money totalPrice) {
		super();
		this.position = position;
		this.service = service;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Money getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Money totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
