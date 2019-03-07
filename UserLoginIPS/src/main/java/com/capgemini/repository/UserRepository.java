package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserNameAndPassword(String userName , String password);
}
