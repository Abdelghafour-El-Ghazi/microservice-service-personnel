package com.proj.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.entities.Admin;
import com.proj.services.AdminService;
import com.proj.vo.ResponseTemplateVO2;

@RestController
@RequestMapping("/Personnel")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/Admin/add")
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminService.saveAdmin(admin);
    }

	
	@GetMapping("/Admin/admins")
    public List<Admin> findAllAdmins() {
        return adminService.getAdmins();
    }
	
	@GetMapping("/Admin/adminById/{id}")
    public Admin findAdminById(@PathVariable Long id) {
        return adminService.getAdminById(id);
    }
	
	@GetMapping("/Admin/adminWithCompte/{id}")
    public Admin getAdminWithCompte(@PathVariable("id") Long adminId) {
        return adminService.afficherAdmin(adminId);
    }
	
	@PutMapping("/Admin/update")
    public Admin updateAdmin(@RequestBody Admin admin) {
        return adminService.updateAdmin(admin);
    }
	
	@DeleteMapping("/Admin/delete/{id}")
    public String deleteAdmin(@PathVariable Long id) {
        return adminService.deleteAdmin(id);
    }
	
}
