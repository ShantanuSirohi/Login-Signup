package com.project.dto;

public class UserDto {

	
private String username;
	
	private String password;
	
	private String email;
	
	private String role;
	
	private boolean status;
	
	private String imageUrl;
	
	private String about;
	
	

	public UserDto() {
		
	}

	public UserDto(String username, String password, String email, String role, boolean status, String imageUrl,
			String about) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.status = status;
		this.imageUrl = imageUrl;
		this.about = about;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	
}
