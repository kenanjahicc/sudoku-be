package com.sudoku.models.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="record")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="tableId")
    private Long tableId;//Foreign Key
    @Column(name="userId")
    private Long userId;//Foreign Key
    @Column(name="seconds")
    private Long seconds;
}
