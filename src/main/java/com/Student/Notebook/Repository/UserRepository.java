package com.Student.Notebook.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.Notebook.Entity.User;
import com.Student.Notebook.Notebookservice.UserService;

public interface UserRepository extends JpaRepository <User,Long> {

	User findByUsername(String username);

	boolean existsByUsername(String username);

	boolean existsByEmail(String email);

	
	
	

}
