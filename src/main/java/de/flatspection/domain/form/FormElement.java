package de.flatspection.domain.form;

public class FormElement {

	private long id;
	private String name;
	private boolean isRequired;
	private boolean isVisible;
	
	public FormElement() {

	}

	public FormElement(long id, String name, boolean isRequired, boolean isVisible) {
		super();
		this.id = id;
		this.name = name;
		this.isRequired = isRequired;
		this.isVisible = isVisible;
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

	public boolean isRequired() {
		return isRequired;
	}

	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
}
