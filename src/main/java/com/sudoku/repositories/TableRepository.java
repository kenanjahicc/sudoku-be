package com.sudoku.repositories;

import com.sudoku.models.entities.Tablen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Tablen, Long> {

}
