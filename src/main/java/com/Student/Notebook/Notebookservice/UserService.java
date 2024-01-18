package com.Student.Notebook.Notebookservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Notebook.Entity.LoginDto;
import com.Student.Notebook.Entity.User;
import com.Student.Notebook.Entity.UserDto;
import com.Student.Notebook.Repository.PasswordEncoder;
import com.Student.Notebook.Repository.UserRepository;

@Service
public class UserService {

	
	private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(UserDto userDto) {
        // Check if the username or email is already registered
        if (userRepository.existsByUsername(userDto.getUsername()) || userRepository.existsByEmail(userDto.getEmail())) {
            // Handle registration failure, e.g., by throwing an exception or returning a specific response
            return null;
        }

        // Create a new user entity
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        // Save the user to the database
        return userRepository.save(user);
    }

    public String loginUser(LoginDto loginDto) {
        User user = userRepository.findByUsername(loginDto.getUsername());

        // Check if the user exists and the password is correct
        if (user != null && passwordEncoder.matches(loginDto.getPassword(), user.getPassword())) {
            // Generate and return a JWT token (or perform any other authentication logic)
            // This is a simplified example; in a real-world scenario, use a proper authentication mechanism
            return "your_generated_jwt_token_here";
        }

        // Return null or throw an exception to indicate login failure
        return null;


}

	}
