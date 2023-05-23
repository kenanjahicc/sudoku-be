package com.sudoku.controllers;

import com.sudoku.models.RecordDto;
import com.sudoku.models.TableDto;
import com.sudoku.services.TableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/table")
public class TableController {
    private final TableService tableService;

    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping("/{difficulty}")
    public TableDto getTable(@PathVariable long difficulty){
        return tableService.getTable(difficulty);
    }
    @GetMapping
    public TableDto getRandomTableDiff(){
        return tableService.getRandomTableDiff();
    }
//    @GetMapping("/count/all")
//    public long getNumOfTriesTotal(){
//        return userService.getNumOfTriesTotal();
//    }
//    @
//    public RecordDto getHighScores(){
//        return userService.getHighScores();
//    }


}
