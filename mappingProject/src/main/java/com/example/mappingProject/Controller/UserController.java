package com.example.mappingProject.Controller;



import org.springframework.web.bind.annotation.*;

import com.example.mappingProject.Entity.User;
import com.example.mappingProject.Repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepo;

    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/by-email")
    public User getUserByEmail(@RequestParam String email) {
        return userRepo.findUserByProfileEmail(email);
    }

    @GetMapping
    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }
}
