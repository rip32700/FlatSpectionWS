package de.flatspection.domain.media.form;

public class FormElement {

	protected String name;
	protected Boolean isRequired;
	protected Object value;
	
	public FormElement() {

	}

	public FormElement(String name, Boolean isRequired, Object value) {
		super();
		this.name = name;
		this.isRequired = isRequired;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	
}
