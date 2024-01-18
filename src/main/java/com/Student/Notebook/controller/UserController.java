package com.Student.Notebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Student.Notebook.Entity.LoginDto;
import com.Student.Notebook.Entity.User;
import com.Student.Notebook.Entity.UserDto;
import com.Student.Notebook.Notebookservice.UserService;

@Controller
@RequestMapping
public class UserController {

	private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/Register")
    public ResponseEntity<User> registerUser(@RequestBody UserDto userDto) {
        User registeredUser = userService.registerUser(userDto);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

    @PostMapping("/Login_User")
    public ResponseEntity<String> loginUser(@RequestBody LoginDto loginDto) {
        String token = userService.loginUser(loginDto);
        if (token != null) {
            return new ResponseEntity<>(token, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
        }
    }
	

}
