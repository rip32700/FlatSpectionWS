package de.flatspection.domain.media;

import java.util.List;

public class MediaTemplate {

	private String name;
	private String description;
	private Media media;
	private List valueList;
	
	public MediaTemplate() {
		
	}

	public MediaTemplate(String name, String description, Media media, List valueList) {
		super();
		this.name = name;
		this.description = description;
		this.media = media;
		this.valueList = valueList;
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

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public List getValueList() {
		return valueList;
	}

	public void setValueList(List valueList) {
		this.valueList = valueList;
	}
	
	
}
