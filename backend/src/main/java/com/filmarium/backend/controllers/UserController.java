package com.filmarium.backend.controllers;

import com.filmarium.backend.entities.User;
import com.filmarium.backend.entities.UserRole;
import com.filmarium.backend.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // (GET http://localhost:8080/users/get)
    @GetMapping("/get")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.addUser(
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getRole()
        );
    }
    @DeleteMapping ("/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }

    @PatchMapping ("/{id}")
    public User updateUser(@PathVariable long id, @RequestBody User user) {
        return userService.updateUser(user, id);
    }
}
