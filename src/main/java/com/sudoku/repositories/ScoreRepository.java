package com.sudoku.repositories;
import com.sudoku.models.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Record, Long> {
}
