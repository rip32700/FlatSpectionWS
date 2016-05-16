package de.flatspection.domain.payment;

import java.util.Currency;

@Document
public class Service {
	
	@Id
	private String id;
	private String name;
	private String description;
	private Money netPrice;
	private float tax;
	
	public Service() {

	}

	public Service(String id, String name, String description, Money netPrice, float tax) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.netPrice = netPrice;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Money getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(Money netPrice) {
		this.netPrice = netPrice;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public String getId() {
		return id;
	}

}
