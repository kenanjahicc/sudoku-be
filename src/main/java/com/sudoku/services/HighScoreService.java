package com.sudoku.services;

import com.sudoku.models.RecordDto;
import com.sudoku.models.entities.Record;
import com.sudoku.repositories.ScoreRepository;
import com.sudoku.repositories.TableRepository;
import com.sudoku.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.javapoet.ClassName;
import org.springframework.stereotype.Service;
import com.sudoku.models.RecordDto;

import java.util.*;

@Service
public class HighScoreService {
    private final UserRepository userRepository;
    private final TableRepository tableRepository;
    private final ScoreRepository scoreRepository;

    public HighScoreService(UserRepository userRepository, TableRepository tableRepository, ScoreRepository scoreRepository) {
        this.userRepository = userRepository;
        this.tableRepository = tableRepository;
        this.scoreRepository = scoreRepository;
    }

    public ResponseEntity<String> addRecord(Long tableId, Long userId, Long seconds) {
            scoreRepository.save(new Record(tableId,userId,seconds));
            return ResponseEntity.ok("Data is valid");
    }
    public ResponseEntity<List<RecordDto>> topTen(Long tableId){
        String username="";
        ArrayList<Record> listasvi= (ArrayList<Record>) scoreRepository.findAllByTableId(tableId);
        Collections.sort(listasvi);
        List<RecordDto> finalni=new ArrayList<>();

        int countTo=listasvi.size();
        if(listasvi.size()>10) countTo = 10;

        for (int i=0;i<countTo;i++) {
            username=userRepository.findById(listasvi.get(i).getId()).get().getUsername();

            finalni.add(new RecordDto(listasvi.get(i).getTableId(),
                    username,listasvi.get(i).getSeconds()));
        }
        return ResponseEntity.ok(finalni);
    }
}
