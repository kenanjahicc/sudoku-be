package com.sudoku.controllers;

import com.sudoku.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/id/{username}")
    public ResponseEntity<String> getUserId(@PathVariable String username){
        return ResponseEntity.ok(String.valueOf(userRepository.findFirstByUsername(username).getId()));
    }
}
