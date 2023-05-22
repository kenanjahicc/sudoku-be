package com.sudoku.controllers;

import com.sudoku.models.UserDto;
import com.sudoku.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public UserDto getUser(long id){
        return userService.getUser(id);
    }
    @PostMapping
    public void addUser(@RequestBody UserDto user){
        userService.addUser(user);
    }
    @DeleteMapping
    public void deleteUser(@RequestBody long id, @RequestBody String password){
        userService.deleteUser(id,password);
    }
}
