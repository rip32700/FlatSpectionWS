package de.flatspection.domain.communication;

import java.time.LocalDate;
import java.util.List;

import de.flatspection.domain.user.User;

@Document
public class Communication {

	@Id
	private String id;
	private LocalDate creationDate;
	private List<Message> messageList;
	private List<User> userList;
	
	public Communication() {

	}

	public Communication(String id, LocalDate creationDate, List<Message> messageList, List<User> userList) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.messageList = messageList;
		this.userList = userList;
	}

	public String getId() {
		return id;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public List<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
}
