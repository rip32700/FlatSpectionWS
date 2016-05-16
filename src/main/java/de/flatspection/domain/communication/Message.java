package de.flatspection.domain.communication;

import java.time.LocalDate;
import java.util.List;

import de.flatspection.domain.media.Media;
import de.flatspection.domain.user.User;

public class Message {

	private User sender;
	private String content;
	private List<Media> mediaList;
	private boolean isRead;
	private LocalDate sendDate;
	
	public Message() {

	}

	public Message(User sender, String content, List<Media> mediaList, boolean isRead, LocalDate sendDate) {
		super();
		this.sender = sender;
		this.content = content;
		this.mediaList = mediaList;
		this.isRead = isRead;
		this.sendDate = sendDate;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Media> getMediaList() {
		return mediaList;
	}

	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}

	public LocalDate getSendDate() {
		return sendDate;
	}

	public void setSendDate(LocalDate sendDate) {
		this.sendDate = sendDate;
	}

	
}
