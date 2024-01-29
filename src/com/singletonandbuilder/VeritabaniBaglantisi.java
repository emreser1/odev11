package com.singletonandbuilder;

public class VeritabaniBaglantisi {

	private static VeritabaniBaglantisi instance;

	private String host;
	private String port;
	private String database;
	private String username;
	private String password;

	private VeritabaniBaglantisi() {
		// Private constructor prevents direct instantiation.
	}

	public static VeritabaniBaglantisi getInstance() {
		if (instance == null) {
			synchronized (VeritabaniBaglantisi.class) {
				if (instance == null) {
					instance = new VeritabaniBaglantisi();
				}
			}
		}
		return instance;
	}

	// Bağlantı kurma ve diğer işlemleri içeren metotlar...

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHost() {
		return host;
	}

	public String getPort() {
		return port;
	}

	public String getDatabase() {
		return database;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public static void setInstance(VeritabaniBaglantisi instance) {
		VeritabaniBaglantisi.instance = instance;
	}
}
