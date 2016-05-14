package de.flatspection.domain.communication;

import java.util.List;


import de.flatspection.domain.User;

public class Message {

	private long id;
	private User sender;
	private String content;
	private List<Media> mediaList;
	private boolean isRead;
	
	public Message() {

	}

	public Message(long id, User sender, String content, List<Media> mediaList, boolean isRead) {
		super();
		this.id = id;
		this.sender = sender;
		this.content = content;
		this.mediaList = mediaList;
		this.isRead = isRead;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
}
