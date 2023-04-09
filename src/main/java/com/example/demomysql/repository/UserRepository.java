package com.example.demomysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demomysql.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
