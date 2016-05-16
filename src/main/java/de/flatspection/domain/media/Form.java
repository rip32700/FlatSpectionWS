package de.flatspection.domain.media;

import java.util.List;

import de.flatspection.domain.media.form.FormElement;

@Document
public class Form extends Media {

	@Id
	protected String id;
	protected List<FormElement> elementList;
	
	public Form() {
		
	}

	public Form(String id, List<FormElement> elementList) {
		super();
		this.id = id;
		this.elementList = elementList;
	}

	public List<FormElement> getElementList() {
		return elementList;
	}

	public void setElementList(List<FormElement> elementList) {
		this.elementList = elementList;
	}

	public String getId() {
		return id;
	}
	
}
