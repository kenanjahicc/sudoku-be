package com.sudoku.services;

import com.sudoku.models.RecordDto;
import com.sudoku.models.TableDto;
import com.sudoku.models.entities.Tablen;
import com.sudoku.repositories.TableRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class TableService {
    private final TableRepository tableRepository;

    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public TableDto getTableOne(long diff){
        if(diff<0||diff>3){
            return new TableDto();
        }
        List<Tablen> x = tableRepository.findAll();
        ArrayList<Tablen> y=new ArrayList<>();
        for (Tablen a:x) {
            if(a.getDifficulty()==diff){
                y.add(new Tablen(a.getId(),a.getAttempted(),a.getTable(),a.getDifficulty()));
            }
        }
        Random random=new Random();
        long randomnum=random.nextLong(y.size()+1);
        String tabela= y.get((int) randomnum).getTable();
        int[][] novatabela = new int[9][9];

        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = tabela.charAt(counter);
                int intValue = (int) ch; // Convert the character to an integer
                intValue-=48;
                novatabela[i][j] = intValue;
                counter++;
            }
        }

        return new TableDto(y.get((int) randomnum).getId(),
                y.get((int) randomnum).getAttempted(),
                novatabela,
                y.get((int) randomnum).getDifficulty());
    }
    public TableDto getRandomTableDiff(){
        long maxid = tableRepository.count()-1;
        Random random=new Random();
        long randomnum=random.nextLong(maxid+1);
        Tablen y=tableRepository.findById(randomnum).get();
        String tabela= y.getTable();
        int[][] novatabela = new int[9][9];

        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = tabela.charAt(counter);
                int intValue = (int) ch; // Convert the character to an integer
                intValue-=48;
                novatabela[i][j] = intValue;
                counter++;
            }
        }

        return new TableDto(y.getId(), y.getAttempted(), novatabela,y.getDifficulty());
    }
    public long getNumOfTriesTotal() {
        return 0;
    }

    public RecordDto getHighScores() {
        return null;
    }
}
