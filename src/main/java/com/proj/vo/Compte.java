package com.proj.vo;

public class Compte {

	private Long compteId;
	private String username;
	private String email;
	private String password;
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Long getCompteId() {
		return compteId;
	}

	public void setCompteId(Long compteId) {
		this.compteId = compteId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
