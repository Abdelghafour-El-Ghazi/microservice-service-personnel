package com.proj.vo;

import com.proj.entities.Admin;

public class ResponseTemplateVO2 {

	private Admin admin;
	private Compte compte;
	
	public ResponseTemplateVO2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseTemplateVO2(Admin admin, Compte compte) {
		super();
		this.admin = admin;
		this.compte = compte;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
}
