package com.sudoku.controllers;

import com.sudoku.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/score")
@RestController
public class RecordController {
    private final UserService userService;
    public RecordController(UserService userService) {
        this.userService = userService;
    }



}
