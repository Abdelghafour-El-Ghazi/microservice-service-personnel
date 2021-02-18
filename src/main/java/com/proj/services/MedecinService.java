package com.proj.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.proj.entities.Medecin;
import com.proj.repositories.MedecinRepository;

@Service
public class MedecinService {
	
	@Autowired
	private MedecinRepository medecinRepository;
	
	public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }
	
	public List<Medecin> saveMedecins(List<Medecin> medecins) {
        return medecinRepository.saveAll(medecins);
    }
	
	public List<Medecin> getMedecins() {
        return medecinRepository.findAll();
    }
	
	public Medecin getMedecinById(Long id) {
        return medecinRepository.findById(id).orElse(null);
    }
	
	public Medecin getMedecinByCin(String cin) {
        return medecinRepository.findByCin(cin);
    }
	
	public String deleteMedecin(Long id) {
		medecinRepository.deleteById(id);
        return "médecin removed !! " + id;
    }
	
	public Medecin updateMedecin(Medecin medecin) {
        Medecin existingMedecin = medecinRepository.findById(medecin.getId()).orElse(null);
        
        
       
        existingMedecin.setCinMedecin(medecin.getCinMedecin());
        existingMedecin.setNom(medecin.getNom());
        existingMedecin.setPrenom(medecin.getPrenom());
        existingMedecin.setSpecialite(medecin.getSpecialite());
        existingMedecin.setNomServiceDep(medecin.getNomServiceDep());
        
        return medecinRepository.save(existingMedecin);
    }
	
	public Medecin afficherMedecin(Long medecinId) {
        
        Medecin medecin = medecinRepository.findById(medecinId).orElse(null);

        return  medecin;
    }
	
	
	
	
	
	
	
	
}

