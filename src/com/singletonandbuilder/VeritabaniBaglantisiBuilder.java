package com.singletonandbuilder;

public class VeritabaniBaglantisiBuilder {

	private VeritabaniBaglantisi instance;

	public VeritabaniBaglantisiBuilder() {
		instance = VeritabaniBaglantisi.getInstance();
	}

	public VeritabaniBaglantisiBuilder setHost(String host) {
		instance.setHost(host);
		return this;
	}

	public VeritabaniBaglantisiBuilder setPort(String port) {
		instance.setPort(port);
		return this;
	}

	public VeritabaniBaglantisiBuilder setDatabase(String database) {
		instance.setDatabase(database);
		return this;
	}

	public VeritabaniBaglantisiBuilder setUsername(String username) {
		instance.setUsername(username);
		return this;
	}

	public VeritabaniBaglantisiBuilder setPassword(String password) {
		instance.setPassword(password);
		return this;
	}

	public VeritabaniBaglantisi build() {
		return instance;
	}
}
