package de.flatspection.domain.payment;

import java.util.Currency;

import de.flatspection.domain.Service;

public class InvoiceItem {

	private long id;
	private Service service;
	private int pieces;
	private Currency total;
	
	public InvoiceItem() {

	}
	
	public InvoiceItem(long id, Service service, int pieces, Currency pricing) {
		super();
		this.id = id;
		this.service = service;
		this.pieces = pieces;
		this.total = pricing;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public Currency getPricing() {
		return total;
	}

	public void setPricing(Currency pricing) {
		this.total = pricing;
	}
	
}
