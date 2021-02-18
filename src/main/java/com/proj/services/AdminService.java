package com.proj.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.proj.entities.Admin;
import com.proj.repositories.AdminRepository;
import com.proj.vo.Compte;
import com.proj.vo.ResponseTemplateVO2;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Autowired
    private RestTemplate restTemplate;
	
	
	public Admin saveAdmin(Admin admin) {
		
        return adminRepository.save(admin);
    }
	
	
	public List<Admin> getAdmins() {
        return adminRepository.findAll();
    }
	
	public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }
	
	public String deleteAdmin(Long id) {
		adminRepository.deleteById(id);
        return "administrateur removed !! " + id;
    }
	
	public Admin updateAdmin(Admin admin) {
        Admin existingAdmin = adminRepository.findById(admin.getId()).orElse(null);
     
        existingAdmin.setNom(admin.getNom());
        existingAdmin.setPrenom(admin.getPrenom());
        existingAdmin.setCinAdmin(admin.getCinAdmin());
        
        return adminRepository.save(existingAdmin);
    }
	
	
	
	public Admin afficherAdmin(Long adminId) {
        
        
        Admin admin = adminRepository.findById(adminId).orElse(null);

       

        return  admin;
    }

}
