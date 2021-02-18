package com.proj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long> {

}