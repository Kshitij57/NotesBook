package com.Student.Notebook.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="User")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long Id;
	
	@Column(name="username")
	private String  username ;
	
	@Column(name="email")
	private String email ;
	
	@Column(name="password")
	private String password ;

	public long getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int id, String username, String email, String password) {
		super();
		Id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
}
