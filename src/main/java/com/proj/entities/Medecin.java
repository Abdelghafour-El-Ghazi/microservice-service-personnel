package com.proj.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medecin implements Serializable{
	
	@Id @GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	private String cinMedecin;
	private String specialite;
	
	private String nomServiceDep;
	
	

	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medecin(String nom, String prenom, String cinMedecin, String specialite, String nomServiceDep,
			String nomDepartement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cinMedecin = cinMedecin;
		this.specialite = specialite;
		this.nomServiceDep = nomServiceDep;
		
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


	public String getSpecialite() {
		return specialite;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	public String getNomServiceDep() {
		return nomServiceDep;
	}


	public void setNomServiceDep(String nomServiceDep) {
		this.nomServiceDep = nomServiceDep;
	}


	


	public String getCinMedecin() {
		return cinMedecin;
	}


	public void setCinMedecin(String cinMedecin) {
		this.cinMedecin = cinMedecin;
	}
	
	
	
	
}
