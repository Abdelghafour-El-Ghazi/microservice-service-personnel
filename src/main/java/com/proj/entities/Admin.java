package com.proj.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin implements Serializable{
	
	@Id @GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	private String cinAdmin;
	
	

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Admin(String nom, String prenom, String cinAdmin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cinAdmin = cinAdmin;
		
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	


	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getCinAdmin() {
		return cinAdmin;
	}



	public void setCinAdmin(String cinAdmin) {
		this.cinAdmin = cinAdmin;
	}

	
	
}
