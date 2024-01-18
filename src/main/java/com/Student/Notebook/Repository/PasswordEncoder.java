package com.Student.Notebook.Repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.Student.Notebook.Notebookservice.UserService;


public class PasswordEncoder {

	
	@Autowired
	private UserService userservice ;
	
	public boolean matches(String password, String password2) {
		// TODO Auto-generated method stub
		return false;
	}

	public String encode(Object password) {
		// TODO Auto-generated method stub
		return null;
	}



}
