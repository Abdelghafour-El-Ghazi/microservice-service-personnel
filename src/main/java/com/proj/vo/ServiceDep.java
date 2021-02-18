package com.proj.vo;

public class ServiceDep {

	private Long id;
    private String reference;
    private String nom;
    private String etat;
	
    public ServiceDep() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ServiceDep(String reference, String nom, String etat) {
		super();
		this.reference = reference;
		this.nom = nom;
		this.etat = etat;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getReference() {
		return reference;
	}



	public void setReference(String reference) {
		this.reference = reference;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getEtat() {
		return etat;
	}



	public void setEtat(String etat) {
		this.etat = etat;
	}



	
	
    
}
