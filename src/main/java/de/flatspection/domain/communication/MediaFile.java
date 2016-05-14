package de.flatspection.domain.communication;

public class MediaFile extends Media {

	private long id;
	private String mimeType;
	private String path;
	
	public MediaFile() {

	}

	public MediaFile(long id, String mimeType, String path) {
		super();
		this.id = id;
		this.mimeType = mimeType;
		this.path = path;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
