package com.sudoku.controllers;

import com.sudoku.models.entities.Record;
import com.sudoku.services.HighScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/record")
@RestController
public class RecordController {
    private final HighScoreService highScoreService;

    public RecordController(HighScoreService highScoreService) {
        this.highScoreService = highScoreService;
    }

    @GetMapping("{tableId}")
    public List<Record> topTen(@PathVariable Long tableId){
        return highScoreService.topTen(tableId);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addRecord(@RequestBody Long tableId, Long userId, Long seconds){
        return highScoreService.addRecord(tableId, userId, seconds);
    }


}
