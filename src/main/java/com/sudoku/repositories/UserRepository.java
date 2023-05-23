package com.sudoku.repositories;

import com.sudoku.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findFirstByUsername(String username);

}
