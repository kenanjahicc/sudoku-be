package com.sudoku.repositories;
import com.sudoku.models.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Record, Long> {
    List<Record> findAllByTableId(Long tableId);
}
