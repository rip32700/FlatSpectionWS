package de.flatspection.domain.communication;

import java.util.List;

import de.flatspection.domain.form.FormElement;

public class TBA extends Media {

	private long id;
	private List<FormElement> formElementList;
	
	public TBA() {
		
	}

	public TBA(long id, List<FormElement> formElementList) {
		super();
		this.id = id;
		this.formElementList = formElementList;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<FormElement> getFormElementList() {
		return formElementList;
	}

	public void setFormElementList(List<FormElement> formElementList) {
		this.formElementList = formElementList;
	}
	
}
