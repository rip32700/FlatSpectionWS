package de.flatspection.domain.media;

import java.net.URI;
import javax.activation.MimeType;

public class MediaFile extends Media {

	protected MimeType mimeType;
	protected URI uri;
	
	public MediaFile() {

	}

	public MediaFile(MimeType mimeType, URI uri) {
		super();
		this.mimeType = mimeType;
		this.uri = uri;
	}

	public MimeType getMimeType() {
		return mimeType;
	}

	public void setMimeType(MimeType mimeType) {
		this.mimeType = mimeType;
	}

	public URI getUri() {
		return uri;
	}

	public void setUri(URI uri) {
		this.uri = uri;
	}

}
