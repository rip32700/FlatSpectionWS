package de.flatspection.domain.communication;

import java.time.LocalDate;

public class Media {

	private long id;
	private String name;
	private String description;
	private LocalDate createionDate;

	public Media() {

	}

	public Media(long id, String name, String description, LocalDate createionDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.createionDate = createionDate;
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

	public LocalDate getCreateionDate() {
		return createionDate;
	}

	public void setCreateionDate(LocalDate createionDate) {
		this.createionDate = createionDate;
	}
	
}
