package edu.demo.common.entity;

public abstract class BaseAction {
	private String actionName;

	public BaseAction() {
		actionName = this.getClass().getSimpleName().toUpperCase();
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	@Override
	public String toString() {
		return "BaseAction [actionName=" + actionName + "]";
	}

}
