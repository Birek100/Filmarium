package com.filmarium.backend.controllers;

import com.filmarium.backend.entities.User;
import com.filmarium.backend.services.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // (GET http://localhost:8080/users)
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
