package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.dto.UserDto;
import com.project.entity.User;
import com.project.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	PasswordEncoder passwordEncoder;
	
	private UserRepository userRepository;
	
	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public User save(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = new User(userDto.getUsername(),passwordEncoder.encode(userDto.getPassword()),userDto.getEmail(),userDto.getRole(), userDto.isStatus(),userDto.getImageUrl(),userDto.getAbout());
		return userRepository.save(user);
	}

}
