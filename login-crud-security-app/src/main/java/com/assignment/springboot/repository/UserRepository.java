package com.assignment.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.springboot.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);

}
