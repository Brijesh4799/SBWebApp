package com.enotes.entity;

import lombok.Data;

@Data
public class UserDtls {
	private int id;
	private String name;
	private String email;
	private String password;
	private String about;
	
	public UserDtls() {
		
	}

}
