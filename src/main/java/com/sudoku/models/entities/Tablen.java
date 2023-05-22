package com.sudoku.models.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tablen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="attempted")
    private Long attempted;
    @Column(name="table")
    private int[][] table=new int[9][9];
}
