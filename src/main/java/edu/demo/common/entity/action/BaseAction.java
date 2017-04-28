package edu.demo.common.entity.action;

public abstract class BaseAction {
	private String actionName;
	private ActionResult result;

	public BaseAction() {
		actionName = this.getClass().getSimpleName().toUpperCase();
	}

	public class ActionResult {
		private boolean success;
		private String message;

		public ActionResult(boolean success, String message) {
			super();
			this.success = success;
			this.message = message;
		}

		public boolean isSuccess() {
			return success;
		}

		public void setSuccess(boolean success) {
			this.success = success;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public String toString() {
			return "ActionResult [success=" + success + ", message=" + message
					+ "]";
		}

	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public ActionResult getResult() {
		return result;
	}

	public void setResult(ActionResult result) {
		this.result = result;
	}

	public abstract BaseAction actionSuccess();

	public abstract BaseAction actionFail();

	public BaseAction generateSuccess(String message) {
		BaseAction action = actionSuccess();
		action.setResult(new ActionResult(true, message));
		return action;
	}

	public BaseAction generateFail(String message) {
		BaseAction action = actionFail();
		action.setResult(new ActionResult(false, message));
		return action;
	}

	@Override
	public String toString() {
		return "BaseAction [actionName=" + actionName + "]";
	}

}
