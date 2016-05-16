package de.flatspection.domain;

public class RentalPropertyAttribute {

	private String name;
	private String description;
	private Object value;
	
	public RentalPropertyAttribute() {

	}
	
	public RentalPropertyAttribute(String name, String description, Object value) {
		super();
		this.name = name;
		this.description = description;
		this.value = value;
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

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
}
