package edu.demo.common.entity.action;

import java.util.Set;

import edu.demo.common.entity.User;

public class UserList extends BaseAction {

	private Set<User> users;

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public BaseAction actionSuccess() {
		return this;
	}

	@Override
	public BaseAction actionFail() {
		return this;
	}

}
