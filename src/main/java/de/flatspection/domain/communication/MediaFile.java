package de.flatspection.domain.communication;

public class MediaFile extends Media {

	private String mimeType;
	private String path;
	
	public MediaFile() {

	}

	public MediaFile(String mimeType, String path) {
		super();
		this.mimeType = mimeType;
		this.path = path;
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
