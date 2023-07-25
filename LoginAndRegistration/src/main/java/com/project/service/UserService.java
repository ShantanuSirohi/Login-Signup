package com.project.service;

import com.project.dto.UserDto;
import com.project.entity.User;

public interface UserService {

	User findByUsername(String username);
	User save(UserDto userDto);
}
