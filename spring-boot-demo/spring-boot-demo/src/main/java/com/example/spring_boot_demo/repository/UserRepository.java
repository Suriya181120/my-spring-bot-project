package com.example.spring_boot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_demo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long>{

	
}	
