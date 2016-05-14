package de.flatspection.domain.communication;

import java.util.List;

import de.flatspection.domain.form.FormElement;

public class TBA extends Media {

	private List<FormElement> formElementList;
	
	public TBA() {
		
	}

	public TBA(List<FormElement> formElementList) {
		super();
		this.formElementList = formElementList;
	}

	public List<FormElement> getFormElementList() {
		return formElementList;
	}

	public void setFormElementList(List<FormElement> formElementList) {
		this.formElementList = formElementList;
	}
	
}
