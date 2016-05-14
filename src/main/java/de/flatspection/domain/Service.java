package de.flatspection.domain;

import java.util.Currency;

public class Service {
	
	private long id;
	private String name;
	private String description;
	private Currency price;
	private Currency tax;
	
	public Service() {

	}

	public Service(long id, String name, String description, Currency price, Currency tax) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.tax = tax;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Currency getPrice() {
		return price;
	}

	public void setPrice(Currency price) {
		this.price = price;
	}

	public Currency getTax() {
		return tax;
	}

	public void setTax(Currency tax) {
		this.tax = tax;
	}
	
}
