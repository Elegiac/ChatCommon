package edu.demo.common.entity.action;

import edu.demo.common.entity.User;

public class Chat extends BaseAction {

	private User from;

	private User to;

	private String chatMessage;

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public User getTo() {
		return to;
	}

	public void setTo(User to) {
		this.to = to;
	}

	public String getChatMessage() {
		return chatMessage;
	}

	public void setChatMessage(String chatMessage) {
		this.chatMessage = chatMessage;
	}

	@Override
	public BaseAction actionSuccess() {
		return new Chat();
	}

	@Override
	public BaseAction actionFail() {
		return new Chat();
	}

	@Override
	public String toString() {
		return "Chat [from=" + from + ", to=" + to + ", chatMessage=" + chatMessage + "]";
	}

}
