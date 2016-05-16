package de.flatspection.domain.communication;

import java.time.LocalDate;

@Document
public class CommunicationTemplate {
	
	@Id
	private String id;
	private String name;
	private String description;
	private String content;
	private LocalDate creationDate;
	private LocalDate lastEditDate;
	
	public CommunicationTemplate() {
		
	}

	public CommunicationTemplate(String id, String name, String description, String content, LocalDate creationDate,
			LocalDate lastEditDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.content = content;
		this.creationDate = creationDate;
		this.lastEditDate = lastEditDate;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getLastEditDate() {
		return lastEditDate;
	}

	public void setLastEditDate(LocalDate lastEditDate) {
		this.lastEditDate = lastEditDate;
	}

	public String getId() {
		return id;
	}

}
