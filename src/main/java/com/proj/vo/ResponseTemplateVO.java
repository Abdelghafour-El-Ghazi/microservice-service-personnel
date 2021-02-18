package com.proj.vo;

import com.proj.entities.Medecin;

public class ResponseTemplateVO {

	private Medecin medecin;
	private ServiceDep serviceDep;
	private Compte compte;
	
	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseTemplateVO(Medecin medecin, ServiceDep serviceDep, Compte compte) {
		super();
		this.medecin = medecin;
		this.serviceDep = serviceDep;
		this.compte = compte;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}


	public ServiceDep getServiceDep() {
		return serviceDep;
	}

	public void setServiceDep(ServiceDep serviceDep) {
		this.serviceDep = serviceDep;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
}
