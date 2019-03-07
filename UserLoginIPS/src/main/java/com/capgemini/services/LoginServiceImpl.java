package com.capgemini.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.User;
import com.capgemini.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public String login(User user) {
	System.out.println("user is "+user);
	System.out.println(user.getUserName());
	System.out.println(user.getPassword());
	User user2 = null;
	user2 = userRepository.findByUserNameAndPassword(user.getUserName() , user.getPassword());
	System.out.println("user2 is "+user2);
	
	if(userRepository.save(user) != null){
			return "Login Successful";
	}
	
	return "Invalid Credentials";
} 

}
