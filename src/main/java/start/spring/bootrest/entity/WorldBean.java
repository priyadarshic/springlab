package start.spring.bootrest.entity;

import org.springframework.stereotype.Service;

public class WorldBean {

	private String message;

	public WorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}// No converter found Error if no Getter

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "WorldBean [message=" + message + "]";
	}

}
