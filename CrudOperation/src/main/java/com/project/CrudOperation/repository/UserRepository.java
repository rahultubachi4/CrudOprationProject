package com.project.CrudOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.CrudOperation.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}