package com.sudoku.services;

import com.sudoku.models.RecordDto;
import com.sudoku.models.TableDto;
import com.sudoku.models.entities.Tablen;
import com.sudoku.repositories.TableRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TableService {
    private final TableRepository tableRepository;

    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public TableDto getTable(long diff){
        return null;
    }
    public TableDto getRandomTableDiff(){
        long maxid = tableRepository.count()-1;
        Random random=new Random();
        long randomnum=random.nextLong(maxid+1);
        Tablen y=tableRepository.findById(randomnum).get();
        String tabela= y.getTable();
        int[][] novatabela=new int[9][9];
        char[] tabela2=tabela.toCharArray();
        int counter=0;
        for(int i=0;i<9;i++){

            for(int j=0;j<9;j++) {
                novatabela[i][j]=Integer.valueOf(tabela2[counter]);
            }
            counter++;
        }

        TableDto finalna=new TableDto(y.getDifficulty(),y.getAttempted(),novatabela);


        return finalna;
    }
    public long getNumOfTriesTotal() {
        return 0;
    }

    public RecordDto getHighScores() {
        return null;
    }
}
