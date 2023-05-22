package com.sudoku.controllers;

import com.sudoku.models.RecordDto;
import com.sudoku.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/score")
@RestController
public class HighScoreController {
    private final UserService userService;
    public HighScoreController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/count/all")
    public long getNumOfTriesTotal(){
        return userService.getNumOfTriesTotal();
    }
    public RecordDto getHighScores(){
        return userService.getHighScores();
    }

}
