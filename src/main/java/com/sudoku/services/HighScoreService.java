package com.sudoku.services;

import com.sudoku.models.RecordDto;
import com.sudoku.models.entities.Record;
import com.sudoku.repositories.ScoreRepository;
import com.sudoku.repositories.TableRepository;
import com.sudoku.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.javapoet.ClassName;
import org.springframework.stereotype.Service;

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
        if(tableId>0&& tableId< tableRepository.count()-1
                && userId>0 && userId< userRepository.count()
                && seconds>0){
            scoreRepository.save(new Record(tableId,userId,seconds));
            return ResponseEntity.ok("Data is valid");
        }
        else {
            return ResponseEntity.badRequest().body("Bad parameters");
        }
    }
    public ResponseEntity<List<Record>> topTen(Long tableId){
        ArrayList<Record> listasvi= (ArrayList<Record>) scoreRepository.findAllByTableId(tableId);
        Collections.sort(listasvi);
        Collections.reverse(listasvi);
        List<Record> finalni=new ArrayList<>();

        int countTo=listasvi.size();
        if(listasvi.size()>10) countTo = 10;

        for (int i=0;i<countTo;i++) {
            finalni.add(listasvi.get(i));
        }
        return ResponseEntity.ok(finalni);
    }
}
