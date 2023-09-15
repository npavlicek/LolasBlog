package com.npavlicek.SpringDemo;

import org.springframework.data.annotation.Id;

public class MongoUser {
	@Id
	private String id;

	private final String username;
	private final String password;

	public MongoUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("[Username: %s, Password: %s]", username, password);
	}

}
