package edu.demo.common.entity.action;

import edu.demo.common.entity.User;

public class Login extends BaseAction {
	private User user;

	public Login() {
	}

	public Login(String loginName, String password) {
		user = new User();
		user.setLoginName(loginName);
		user.setPassword(password);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Login [user=" + user + "]";
	}

	@Override
	public BaseAction actionSuccess() {
		return new Login();
	}

	@Override
	public BaseAction actionFail() {
		return new Login();
	}

}
